
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

import com.demo.dominio.Cliente;
import com.demo.utilerias.PostGresDB;
import java.awt.Image;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ClienteRepository {
  private static PostGresDB pg =new PostGresDB();
  public void ingresar (Cliente cliente) {
        try {
			
			Connection conn=pg.Open();
			PreparedStatement stm=conn.
			prepareStatement("INSERT INTO cliente( id_cliente, cedula, nombre,  direccion, telefono) "+
					" VALUES (?, ?, ?, ?, ?);");
                        
                            
                            stm.setInt(1, cliente.getId_cliente());
                            stm.setInt(2, cliente.getCedula());
                            stm.setString(3, cliente.getNombre());
                            stm.setString(4, cliente.getDireccion());
                            stm.setInt(5, cliente.getTelefono());
                         
             
                           stm.execute();
                        
			
			stm.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public Cliente getCliente(int id_cliente){
		Cliente cli= new Cliente();
		
		try{
			Connection conn=pg.Open();
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery("select * from cliente where nombre="+id_cliente);
			if(rs.next()){

                               cli=new Cliente(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5));
                                
			}
			
			rs.close();
			stm.close();
			conn.close();
			
		}catch(SQLException ex){
			
		}
		
		return cli;
	}
    public ArrayList<Cliente> getClientes(){
		ArrayList<Cliente> clientes=new ArrayList<Cliente>();
		try {
			Connection conn=pg.Open();
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery("select * from cliente");
			
			while(rs.next()){
   Cliente cliente =new Cliente(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5));
                                clientes.add(cliente);
                                
                                
			}
			rs.close();
			stm.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clientes;
	}
public boolean eliminar(String id_cliente) {
			
			try {
				
				Connection conn=pg.Open();
				PreparedStatement stm=conn.
				prepareStatement("delete from cliente where id_cliente='"+id_cliente+"';");
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
 public  void   consultar (JTable tabla, String script)
    {
        
		Statement codigoSQL=null;
		ResultSet resultados=null;
		try{
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
		
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, ex);
		}

	}


}
                          
                        
                          
                          
                        
                        
                        



