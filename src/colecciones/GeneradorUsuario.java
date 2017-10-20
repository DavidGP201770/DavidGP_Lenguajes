/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUGPLPW7
 */
public class GeneradorUsuario {
    public static void main(String[] args) {
        
        //vamos a generar 5 usuarios
        Usuario u1 = new Usuario();
        u1.setEdad(20);
        u1.setEmail("davicho@gmail.com");
        u1.setNombre("David");
        
        Usuario u5 = new Usuario();
        u5.setEdad(21);
        u5.setEmail("davicho@gmail.com");
        u5.setNombre("David");
        
        Usuario u2 = new Usuario();
        u2.setEdad(22);
        u2.setEmail("davicho2@gmail.com");
        u2.setNombre("Uriel");
        
        Usuario u3 = new Usuario();
        u3.setEdad(23);
        u3.setEmail("davicho3@gmail.com");
        u3.setNombre("Jared");
        
        Usuario u4 = new Usuario();
        u4.setEdad(24);
        u4.setEmail("davicho4@gmail.com");
        u4.setNombre("Diana");
        
        //generamos un arreglo mutable
        ArrayList<Usuario> usuarios =new ArrayList<Usuario>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        
        //vamos a iterarlo para ver los nombres
        
        for(Usuario u:usuarios){
            System.out.println("Nombre: "+u.getNombre()+"emal "+u.getEmail()+" edad"+u.getEdad());
        }
    }
}