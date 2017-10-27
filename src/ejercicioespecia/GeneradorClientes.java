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
public class GeneradorClientes {
    public ArrayList<Cliente> generarClientes() {
        ArrayList<Cliente> clientito= new ArrayList<Cliente>();
        //generamos direcciones clientes
        Direccion d1 = new Direccion("Leon de la barra","Tecamac",55763,"Ecatepec");
        Direccion d2 = new Direccion("De las sirenas","Ecatepec",55764,"Jardines de Morelos");
        Direccion d3 = new Direccion("Circuito 13","Las Americas",55765,"Ojo de Agua");
        
        ArrayList<Direccion> direcciones1 = new ArrayList<Direccion>();
        direcciones1.add(d1);
        direcciones1.add(d2);
        direcciones1.add(d3);
        
        //generamos clientes
        Cliente c1 = new Cliente("David",20,"david@gmail.com",d1);
        Cliente c2 = new Cliente("Uriel",21,"uriel@gmail.com",d2);
        Cliente c3 = new Cliente("Yulissa",19,"yuli@gmail.com",d3);
        
        clientito.add(c1);
        clientito.add(c2);
        clientito.add(c3);
        
        
    return clientito;
    }
}
