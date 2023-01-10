/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author catbe
 */
public class conexion {
    Connection con;
    
  public conexion(){
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_medico_g", "root", "");
      } catch (Exception e){
          System.err.println("" +e);          
      }
  }
  public Connection getConnection(){
      return con;
  }
}

