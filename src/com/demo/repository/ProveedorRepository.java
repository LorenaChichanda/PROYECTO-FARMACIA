
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

import com.demo.dominio.Proveedor;
import com.demo.utilerias.PostGresDB;
import java.awt.Image;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProveedorRepository {
    private static PostGresDB pg =new PostGresDB();
       public static void ingresar(Proveedor proveedor) {
			
        try {
     
     Connection conn=pg.Open();
            PreparedStatement stm=conn.
                    prepareStatement("INSERT INTO proveedor(id_proveedor, nombre, cedula, direccion, telefono) "+
					" VALUES (?, ?, ? ,?,?);");
          
        
            stm.setInt(1, proveedor.getId_proveedor());
            stm.setString(2, proveedor.getNombre());
            stm.setInt(3, proveedor.getCedula());    
            stm.setString(4,proveedor.getDireccion());
            stm.setInt(5, proveedor.getTelefono());
            stm.execute();
            
            
            stm.close();
            conn.close();
      	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
       public Proveedor getProveedor(int id_proveedor ){
          Proveedor prov=new Proveedor();
           try {
               Connection conn=pg.Open();
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery("select * from proveedor where nombre="+id_proveedor);
			if(rs.next()){
				
                                prov=new Proveedor(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5));
                                
           }
                        
                        rs.close();
			stm.close();
			conn.close();
           } catch (Exception ex) {
           }
           return prov;
       }
      public ArrayList<Proveedor> getProveedors(){
          ArrayList<Proveedor> proveedors=new ArrayList<Proveedor>();
          try {
              Connection conn=pg.Open();
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery("select * from proveedor");
              while(rs.next()){
                  Proveedor proveedor=new Proveedor(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5));
                                proveedors.add(proveedor);
              }
                        rs.close();
			stm.close();
			conn.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
          return proveedors;
      }
          public boolean eliminar(String id_proveedor) {
			
			try {
				
				Connection conn=pg.Open();
				PreparedStatement stm=conn.
				prepareStatement("delete from proveedor where id_proveedor='"+id_proveedor+"';");
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




