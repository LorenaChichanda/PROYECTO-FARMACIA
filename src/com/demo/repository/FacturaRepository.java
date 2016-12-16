
package com.demo.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.demo.dominio.Factura;
import com.demo.utilerias.PostGresDB;
import java.awt.Image;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class FacturaRepository {
    private static PostGresDB pg =new PostGresDB();
       public static void ingresar(Factura factura) {
           try {
    
     Connection conn=pg.Open();
            PreparedStatement stm=conn.
                    prepareStatement("INSERT INTO factura(id_factura,  nombre,  producto, cantidad, tpagar,  preciouni,cedula  ) "+
					" VALUES (?, ?, ? ,?,?,?,?);");
          
        
            stm.setInt(1, factura.getId_factura());     
            stm.setString(2, factura.getNombre());    
            stm.setString(3,factura.getProducto());
            stm.setInt(4, factura.getCantidad());
            stm.setInt(5, factura.getTpagar());
            stm.setInt(6, factura.getPreciouni());
             stm.setInt(7, factura.getCedula());
            stm.execute();
            
            
            stm.close();
            conn.close();
      	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
       public Factura getFactura(int id_factura ){
          Factura fac=new Factura();
           try {
               Connection conn=pg.Open();
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery("select * from factura where nombre="+id_factura);
			if(rs.next()){
				
                                fac=new Factura(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7));
           }
                        rs.close();
			stm.close();
			conn.close();
           } catch (Exception ex) {
           
       }
return fac;
}
      public ArrayList<Factura> getFacturas(){
          ArrayList<Factura> facturas=new ArrayList<Factura>();
          try {
              Connection conn=pg.Open();
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery("select * from factura");
              while(rs.next()){
                  Factura factura=new Factura(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7));
                                facturas.add(factura);
                               
              }
                        rs.close();
			stm.close();
			conn.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
          return facturas;
      }
      public boolean eliminar(String id_factura) {
			
			try {
				
				Connection conn=pg.Open();
				PreparedStatement stm=conn.
				prepareStatement("delete from importaciones where id_factura='"+id_factura+"';");
                                stm.execute();
				
				stm.close();
				conn.close();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;	
				}
}
      public void consultar (JTable tabla, String script)
              
           {
               Statement codigoSQL=null;
		ResultSet resultados=null;
                try {
                   DefaultTableModel t = new DefaultTableModel();
		tabla.setModel(t);
		
                
                Connection conn=pg.Open();
                
		codigoSQL=conn.createStatement();
		resultados=codigoSQL.executeQuery(script);
		ResultSetMetaData datos=resultados.getMetaData(); 
		int numeroColumna = datos.getColumnCount();
		for(int i=1;i<=numeroColumna;i++){
			t.addColumn(datos.getColumnLabel(i));
		}
                while(resultados.next()){
			Object [] f =new Object [numeroColumna];
			for(int i=0;i<numeroColumna;i++){
			f[i]=resultados.getObject(i+1);	
			}
			t.addRow(f);
		}
                codigoSQL.close();
		resultados.close();
		conn.close();
               } catch (Exception ex) {
                   JOptionPane.showMessageDialog(null, ex);
               }
           }
}



