/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.Calendar;

/**
 *
 * @author DUGPLPW7
 */
public class UltimoReloj {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Calendar c = Calendar.getInstance();
                        Thread.sleep(1000);
                        int hora = c.get(Calendar.HOUR);
                        int min = c.get(Calendar.MINUTE);
                        int seg = c.get(Calendar.SECOND);
                        System.out.println("La hora es: " + hora + ":" + min + ":" + seg);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        t1.start();
    }
}
