package com.demo.utilerias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PostGresDB {
	
	private static Connection conn;
	public static String url = "jdbc:postgresql://127.0.0.1/farmaciaS";
    public static String user = "postgres";
    public static String password = "1234";
    
    public  Connection Open() throws SQLException{
    	conn=DriverManager.getConnection(url, user, password);
    	return conn;
    }
    public void close() throws SQLException{
    	conn.close();
    }

    /**
    *
    *Método utilizado para realizar las instrucciones: INSERT, DELETE y UPDATE
    *@param sql Cadena que contiene la instrucción SQL a ejecutar
    *@return estado regresa el estado de la ejecución, true(éxito) o false(error)
    *
    */
    public boolean ejecutarSQL(String sql)
    {
       try {
           PreparedStatement sentencia = conn.prepareStatement(sql);
          sentencia.execute(sql);
          return true;
       } catch (SQLException ex) {
            return false;
       }
    }

    /**
    *
    *Método utilizado para realizar la instrucción SELECT
    *@param sql Cadena que contiene la instrucción SQL a ejecutar
    *@return resultado regresa los registros generados por la consulta
    *
    */
    public ResultSet ejecutarSQLSelect(String sql)
    {
       ResultSet resultado;
       try {
          PreparedStatement sentencia = conn.prepareStatement(sql);
          resultado = sentencia.executeQuery();
          return resultado;
       } catch (SQLException ex) {
          System.err.println("Error "+ex);
          return null;
       }
    }
}



