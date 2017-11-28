/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author DUGPLPW7
 */
public class ProbarConexion {
    public static void main(String[] args) {
        Connection con=null;
        //
        try{
            con= Conexion.conectarse("root", "root");
            System.out.println("Te conectaste!!");
            //aqui se vienen queries de mysql
            
            
        }
        catch(ClassNotFoundException e){
            System.out.println("No se cargo bien el driver");
        }catch(SQLException e){
            
        }finally{
            try{
                if(con!=null)con.close();
                
            }catch(SQLException ex){
            
            }
        }    
    }
}
 
