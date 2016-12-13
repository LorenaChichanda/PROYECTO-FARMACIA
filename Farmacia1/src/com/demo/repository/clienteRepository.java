/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.repository;

import com.demo.dominio.cliente;
import com.demo.utilerias.PostGresDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VK-PC
 */
public class clienteRepository {
        private static PostGresDB pg =new PostGresDB();
       public static void ingresar(cliente cliente) {
			
        try {
     //       Connection conn=PostGresDB.Open();
     Connection conn=pg.Open();
            PreparedStatement stm=conn.
                    prepareStatement("INSERT INTO cliente( id_cliente , cedula , nombre , direccion , telefono , sexo ) "+
					" VALUES (?, ?, ? , ?, ?);");
          
        
            stm.setInt(1, cliente.getId_cliente());
            stm.setInt(2, cliente.getCedula());
            stm.setString(3, cliente.getNombre());    
            stm.setString(4,cliente.getDireccion());
            stm.setInt(5, cliente.getTelefono());
            stm.setString(6,cliente.getSexo());
            stm.execute();
            
            
            stm.close();
            conn.close();
      	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
    }
    public cliente getBodega(int id_cliente){
		
		cliente cl=new cliente();
		
		try{
			Connection conn=pg.Open();
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery("select * from cliente where id_cliente="+id_cliente);
			if(rs.next()){
				
//                                bod=new cliente(rs.getInt(1),rs.getString(2),rs.getString(3));
//                               // int id_cliente, int cedula, String nombre, String direccion, int telefono, String sexo
//			cl=new cliente(rs.getInt(1),rs.getInt(2),rs.getString(3));
//                        }
			
			rs.close();
			stm.close();
			conn.close();
			
		}catch(SQLException ex){
			
		}
		
		return bod;
	
                }
}
    
