/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.List;


public class GeneradorUsuario {
    public static void main(String[] args) {
        
        //Vamos a generar 5 usuarios
        Usuario u1=new Usuario();
        u1.setEdad(23);
        u1.setEmail("rapidclimate@gmail.com");
        u1.setNombre("Juan");
        
        Usuario u2=new Usuario();
        u2.setEdad(19);
        u2.setEmail("otro@gmail.com");
        u2.setNombre("Ana");
        
        Usuario u3=new Usuario();
        u3.setEdad(22);
        u3.setEmail("nuevo@gmail.com");
        u3.setNombre("Pedro");
        
      //Generaremos un arreglo mutable
      
      ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
      usuarios.add(u1);
      usuarios.add(u2);
      usuarios.add(u3);
      
      //Vamos a iterarlo para ver los nombres
      for(Usuario u: usuarios){
System.out.println("NOmbre "+u.getNombre()+" email "+u.getEmail());
      }
    }
}
