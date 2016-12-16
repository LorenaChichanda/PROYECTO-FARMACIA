
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

import com.demo.dominio.Registro;
import com.demo.utilerias.PostGresDB;
import java.awt.Image;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RegistroRepository {
   private static PostGresDB pg =new PostGresDB();
 public static void ingresar(Registro registro) {
			
        try {
     Connection conn=pg.Open();
            PreparedStatement stm=conn.
                    prepareStatement("INSERT INTO Registro( id_registro,  ciudad, direccion, email, telefono, codigo_regional ) "+
					" VALUES (?, ?, ? ,?,?,?);");
          
        
            stm.setInt(1, registro.getId_registro());
            stm.setString(2, registro.getCiudad());
            stm.setString(3, registro.getDireccion());    
            stm.setString(4,registro.getEmail());
            stm.setInt(5, registro.getTelefono());
            stm.setInt(6, registro.getCodigo_regional());
            stm.execute();
            
            
            stm.close();
            conn.close();
      	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
       public Registro getRegistro(int id_registro ){
          Registro re=new Registro();
           try {
               Connection conn=pg.Open();
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery("select * from registro where nombre="+id_registro);
			if(rs.next()){
				
                                re=new Registro(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6));
                                //Cliente.add(cli);
           }
                        
                        rs.close();
			stm.close();
			conn.close();
           } catch (Exception ex) {
           }
           return re;
       }
      public ArrayList<Registro> getRegistros(){
          ArrayList<Registro> registros=new ArrayList<Registro>();
          try {
              Connection conn=pg.Open();
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery("select * from registro");
              while(rs.next()){
                  Registro registro=new Registro(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6));
                                registros.add(registro);
              }
                        rs.close();
			stm.close();
			conn.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
          return registros;
      }
      public boolean eliminar(String id_registro) {
			
			try {
				
				Connection conn=pg.Open();
				PreparedStatement stm=conn.
				prepareStatement("delete from importaciones where id_registro='"+id_registro+"';");
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




	