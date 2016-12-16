
package com.demo.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.demo.dominio.Producto;
import com.demo.utilerias.PostGresDB;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ProductoRepository {
       private static PostGresDB pg =new PostGresDB();
       public static void ingresar(Producto producto) {
			
        try {
     
     Connection conn=pg.Open();
            PreparedStatement stm=conn.
                    prepareStatement("INSERT INTO producto(id_producto, nombre, cantidad,  precio  ) "+
					" VALUES (?, ?, ? ,?);");
          
        
            stm.setInt(1, producto.getId_producto());
            stm.setString(2, producto.getNombre());
            stm.setInt(3, producto.getCantidad());    
            stm.setDouble(4,producto.getPrecio());
            stm.execute();
            
            
            stm.close();
            conn.close();
      	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
       public Producto getProducto(int id_producto ){
          Producto pro=new Producto();
           try {
               Connection conn=pg.Open();
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery("select * from producto where nombre="+id_producto);
			if(rs.next()){
				
                                pro=new Producto(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4));
           }                    Producto.add(pro);
                        rs.close();
			stm.close();
			conn.close();
           } catch (Exception ex) {
           }
           return pro;
       }
      public ArrayList<Producto> getProductos(){
          ArrayList<Producto> productos=new ArrayList<Producto>();
          try {
              Connection conn=pg.Open();
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery("select * from producto");
              while(rs.next()){
                  Producto pro=new Producto (rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4));
                                Producto.add(pro);
              }
                        rs.close();
			stm.close();
			conn.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
          return productos;
      }
          public boolean eliminar(String nombre) {
			
			try {
				
				Connection conn=pg.Open();
				PreparedStatement stm=conn.
				prepareStatement("delete from producto where nombre='"+nombre+"';");
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



