/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author DUGPLPW7
 */
public class Prueba {
    
public static void main(String[] args) {
        
    // vamos a probar tipos de datos
        byte b=2;
        short s=2;
        int i=2; // EL DEFAULT
        long l=2;
       
      // algunas  de las siguientes lineas marcaran error  
        //b=s;  error de casting
        b=(byte)s; // forma correcta
        s=b;
        i=s;
        l=s;
        s=(short)l;
        b=(byte)i;
        // algo chistoso con los flotantes
        // float f=2.0;
       // primera forma float f=(float)2.0;
       // segunda
       float f=2.0f;
       double d=2.0; // DEFAULT
       
       boolean b1=true;
       boolean b2=false; // DEFAULT
       
       //TIPO CARACTER
       
       char algo='D';
       char otro=' ';
        
    }
}   
