/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioespecial2;

/**
 *
 * @author DUGPLPW7
 */
public class ProbarCliente {
    public static void main(String[] args) {
        Direccion d=new Direccion(1,55130l, "mexico", "Ecatepec");
        Cliente c=new Cliente(1, "David", 20,d);
        PersistenciaCliente pc=new PersistenciaCliente();
        try{
            System.out.println(pc.guardarCliente(c, d));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
