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
public class ProbarConexion1 {
    public static void main(String[] args) {
        Connection con=null;
        //
        try{
            con= Conexion.conectarse("root", "root");
            System.out.println("Te conectaste!!");
            //aqui se vienen queries de mysql
          //CASO SELECT
          //PASO 1 GENERAR QUERY
          
          Statement st=con.createStatement();
          ResultSet rs= st.executeQuery("select * from tablita");
        }
        catch(ClassNotFoundException e){
            System.out.println("No se cargo bien el driver");
        }catch(SQLException e){
            System.out.println("No se cargo algo bien en sql ");
        }finally{
            try{
                if(con!=null)con.close();
                
            }catch(SQLException ex){
                System.out.println("No se cargo bien en sql");
            }
        }    
    }
}
 
