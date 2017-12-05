/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DUGPLPW7
 */
public class Segundo extends Thread{
    public void run()
    {
        while(true){
        
        //aqui va lo que hace el thread
        System.out.println("Soy un thread que no hace nada 2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Segundo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
