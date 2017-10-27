/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioespecia;

import java.util.ArrayList;

/**
 *
 * @author DUGPLPW7
 */
public class ProbarClientes {
    public static void main(String[] args) {
        GeneradorClientes cliente = new GeneradorClientes();
      
        for(Cliente i:cliente.generarClientes()){  
            System.out.println(" Nombre: "+i.getNombre()+" Edad: "+i.getEdad()+" Email: "+i.getEmail()+" Direccion: \n"+i.getDireccion().getCalle()+" "+i.getDireccion().getColonia()+" "+i.getDireccion().getCp()+" "+i.getDireccion().getMunicipio());
        }
    }
}
