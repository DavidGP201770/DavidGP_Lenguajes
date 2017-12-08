/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author DUGPLPW7
 */
public class RelojitoChafa implements Runnable{
    public static void main(String[] args) {
        Runnable r= new RelojitoChafa();
        Thread t1 = new Thread(r);
        t1.start();
        
    }
    
    public void run(){
            while(true){
                try{
            Calendar c= Calendar.getInstance();
            Thread.sleep(1000);
            int hora=c.get(Calendar.HOUR);
            int min=c.get(Calendar.MINUTE);
            int seg=c.get(Calendar.SECOND);
            System.out.println("La hora es: "+hora+":"+min+":"+seg);
                }catch(InterruptedException e) {}
       }
    }
}
