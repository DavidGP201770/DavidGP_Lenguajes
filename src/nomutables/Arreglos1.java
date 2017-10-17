/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomutables;

/**
 *
 * @author DUGPLPW7
 */
public class Arreglos1 {
    public static void main(String[] args) {
        //VAMOS A GENERAR UN ARREGLO SIMPLES
        int x[]={12,-4,7};
        System.out.println("El tamaño del arreglo es "+x.length);
        //PARA ACCEDER A UN ELEMENTO HACEMOS LO SIGUIENTE:
        System.out.println("En el indice 0 esta "+x[2]);
        int []y={2,4,5};
        int []z=new int[3];
        z[0]=-12;
        z[1]=5;
        z[2]=4;
        
        //vamos a iterar el arreglo z usando un ciclo for
        for (int i=0;i<z.length;i++){
            System.out.println(z[i]);            
            }
        //FOR MEJORADO
        
        for(int valor:z){
            System.out.println("mejorado "+valor);
        }
        
        String mensaje="hola como estas";
       
        byte[]w= mensaje.getBytes();
        System.out.println("tamaño "+w.length);
        String codificado="";
        for(byte b:w){
            System.out.println("el byte es "+b);
            codificado=codificado+b;    
        }
        
        System.out.println("el mensaje codificado es");
        System.out.println(codificado);
        
    }
}