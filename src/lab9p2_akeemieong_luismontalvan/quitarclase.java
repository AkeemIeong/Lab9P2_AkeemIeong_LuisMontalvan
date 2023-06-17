/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_akeemieong_luismontalvan;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author SURFACEB2I7
 */
public class quitarclase extends Thread{
    public void run() {
        
        for (int i = 0; i < 5; i++) {
            Date h=new Date();
            DateFormat f=new SimpleDateFormat("hh:mm:ss");
                System.out.println(f.format(h));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
        JOptionPane.showMessageDialog(null, "Se quito exitosamente");
    }
}
