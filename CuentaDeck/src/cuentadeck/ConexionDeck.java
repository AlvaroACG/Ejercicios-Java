/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentadeck;

import java.sql.*;

/**
 *
 * @author alvar
 */
public class ConexionDeck {
    
    private final String url="jdbc:mysql://localhost:3306/decks";
    private final String user="root";
    private final String pass="";
    
  
    public Connection obtieneConexion() throws SQLException{
        Connection cn;
      
        cn=DriverManager.getConnection(url,user,pass);
        
        return cn;
    }
    
    
}