/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones.utiles;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Azergal
 */
public class Temporizador {
    
    
    public static void main(String[] args) {

        DameLaHora oyente = new DameLaHora();
        
        Timer miTemporizador = new Timer(5000, oyente);
        
        miTemporizador.start();
        
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener.");
        
        System.exit(0);
    }
    
    static class DameLaHora implements ActionListener{
    
        @Override
        public void actionPerformed(ActionEvent e){
       
            Date ahora = new Date();
            
            System.out.println("Hora cada 5 segundos: " + ahora);
            
            Toolkit.getDefaultToolkit().beep();
        } 
        
    }

}
