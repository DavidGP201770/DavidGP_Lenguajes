/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioespecial2;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DUGPLPW7
 */
public class PersistenciaCliente {
    public String guardarCliente(Cliente c, Direccion d){
          Connection con=null;
          String mensaje="";
         // conexion;
        try{
            con= conexion.Conexion.conectarse("root", "root");
            System.out.println("Te conectaste!!");
            
             PreparedStatement std = con.prepareStatement("insert into Direccion values(?,?,?,?)");
               std.setInt(1, d.getId());
               std.setInt(2, (int) d.getCp());
               std.setString(3,d.getCalle() );
               std.setString(4, d.getMunicipio());
               std.execute();
            
            PreparedStatement stc = con.prepareStatement("insert into Cliente values(?,?,?,?)");
            
            stc.setInt(1, 1);
            stc.setString(2,c.getNombre());
            stc.setInt(3, c.getEdad());
            stc.setInt(4, d.getId());
            //invocar o dar enter 
            stc.execute();
            
            mensaje="Registro insertado";
            std.close();
            stc.close();
          
        }
        catch(ClassNotFoundException e){
            mensaje="No se cargo bien el driver";
        }catch(SQLException e){
            mensaje=e.getMessage();
        }finally{
            try{
                if(con!=null)con.close();
                
            }catch(SQLException ex){
                mensaje="No se cargo bien en sql";
            }
        }    
        
        return mensaje;
    }
    
    public String buscarCliente(int id){
        
        Connection con=null;
          String mensaje="";
         // conexion;
        try{
            con= conexion.Conexion.conectarse("root", "root");
            System.out.println("Te conectaste!!");
            
            Statement stc=con.createStatement();
            ResultSet rs= stc.executeQuery("select * from Cliente where id="+id);
            
            ArrayList<Cliente> registros=new ArrayList<>();
          while(rs.next())
          {    
              Cliente c= new Cliente();
           
              c.setId(rs.getInt(1));
              c.setNombre(rs.getString(2));
              c.setEdad(rs.getInt(3));
              int idDireccion=  rs.getInt(4);
              Direccion d=new Direccion(idDireccion);
              c.setDireccion(d);
              registros.add(c);
          }
          
          for(Cliente c:registros)
          {
              System.out.println("id \n"+c.getId()+" Nombre"+c.getNombre());
              System.out.println("\n Edad: "+c.getEdad()+" \n Direccion: "+c.getDireccion());
          }
            
            stc.close();
          
        }
        catch(ClassNotFoundException e){
            mensaje="No se cargo bien el driver";
        }catch(SQLException e){
            mensaje=e.getMessage();
        }finally{
            try{
                if(con!=null)con.close();
                
            }catch(SQLException ex){
                mensaje="No se cargo bien en sql";
            }
        }
        return mensaje;    
    }
    
    public String actualizarCliente(Cliente c, Direccion d,int id){
        Connection con=null;
          String mensaje="";
         // conexion;
        try{
            con= conexion.Conexion.conectarse("root", "root");
            System.out.println("Te conectaste!!");
            
             PreparedStatement std = con.prepareStatement("update Direccion set id=?, cp=?, calle=?, municipio=? where id="+id);
               std.setInt(1, d.getId());
               std.setInt(2, (int) d.getCp());
               std.setString(3,d.getCalle() );
               std.setString(4, d.getMunicipio());
               std.execute();
            
            PreparedStatement stc = con.prepareStatement("update Cliente set id=?, nombre=?, edad=?, direccion=? where id="+id);
            
            stc.setInt(1, 1);
            stc.setString(2,c.getNombre());
            stc.setInt(3, c.getEdad());
            stc.setInt(4, d.getId());
            //invocar o dar enter 
            stc.execute();
            
            mensaje="Registro actualizado";
            std.close();
            stc.close();
          
        }
        catch(ClassNotFoundException e){
            mensaje="No se cargo bien el driver";
        }catch(SQLException e){
            mensaje=e.getMessage();
        }finally{
            try{
                if(con!=null)con.close();
                
            }catch(SQLException ex){
                mensaje="No se cargo bien en sql";
            }
        } 
           return mensaje; 
    }
    
    public String buscarTodoslosCliente(){
        Connection con=null;
          String mensaje="";
         // conexion;
        try{
            con= conexion.Conexion.conectarse("root", "root");
            System.out.println("Te conectaste!!");
            
            Statement stc=con.createStatement();
            ResultSet rs= stc.executeQuery("select * from cliente");
            
            ArrayList<Cliente> registros=new ArrayList<>();
          while(rs.next())
          {    
              Cliente c= new Cliente();
              c.setId(rs.getInt(1));
              c.setNombre(rs.getString(2));
              c.setEdad(rs.getInt(3));
              int idDireccion=  rs.getInt(4);
              Direccion d=new Direccion(idDireccion);
              c.setDireccion(d);
              registros.add(c);
          }
          
          for(Cliente c:registros)
          {
              System.out.println("id: "+c.getId()+"\n Nombre "+c.getNombre());
              System.out.println("\n Edad: "+c.getEdad()+" \n Direccion: "+c.getDireccion().getId());
          }
            
            stc.close();
          
        }
        catch(ClassNotFoundException e){
            mensaje="No se cargo bien el driver";
        }catch(SQLException e){
            mensaje=e.getMessage();
        }finally{
            try{
                if(con!=null)con.close();
                
            }catch(SQLException ex){
                mensaje="No se cargo bien en sql";
            }
        }
          return mensaje;  
    }
    
    public String borrarCliente(int id){
          Connection con=null;
          String mensaje="";
         // conexion;
        try{
            con= conexion.Conexion.conectarse("root", "root");
            System.out.println("Te conectaste!!");
            
            PreparedStatement std = con.prepareStatement("delete from Direccion where id="+id);   
            std.execute();
            
            PreparedStatement stc = con.prepareStatement("delete from Cliente where id="+id);
            stc.execute();
         
            mensaje="Registro borrado";
            std.close();
            stc.close();
          
        }
        catch(ClassNotFoundException e){
            mensaje="No se cargo bien el driver";
        }catch(SQLException e){
            mensaje=e.getMessage();
        }finally{
            try{
                if(con!=null)con.close();
                
            }catch(SQLException ex){
                mensaje="No se cargo bien en sql";
            }
        }
          return mensaje;  
    }
}
