/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Usuario
 */
public class conexion {
    
    Connection conex=null;
    
    public Connection conexion(){
    
        String cadena= "jdbc:postgresql://localhost:5432/farmacia";
        String user="postgres";
        String pass="1234";
        try{
            Class.forName("org.postgresql.Driver");
            conex = DriverManager.getConnection(cadena,user,pass);
            //java.sql.Statement st = conex.createStatement();
            
        }catch(Exception exc){
                System.out.println(" Error: " + exc.getMessage());
        }
        return conex;
    }
}

