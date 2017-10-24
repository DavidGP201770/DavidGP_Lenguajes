/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author rapid
 */
public class Prueba1 {
    
    public static void main(String[] args) {
        
        //Probaremos los tipos de datos integrales
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
  //Algunas deLas siguientes lineas van a marcar error
        b=(byte)s;
        
        s=b;
        
        i=s;
        
        l=s;
        
        s=(short)l;
        
        b=(byte)i; 
       //algo chistos con los flotantes
       float f=2.0F;
       double d=2.0;
       
       boolean b1=true;
       boolean b2=false;
       
       //Tipo caracter
       char algo='h';
       char otro=' ';
    }
}
