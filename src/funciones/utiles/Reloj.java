/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones.utiles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Azergal
 */
public class Reloj {
    
    private int interval;
    
    public Reloj(int interval) {
        this.interval = interval;
    }
    
    public void enMarcha(){
        ActionListener listener = new GetTime();
        Timer timer = new Timer (interval, listener);
        timer.start();
    }
    
    private class GetTime implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Date date = new Date();
            System.out.println("Tieme very " + interval + " ms: " + date);
        } 
    }
}
