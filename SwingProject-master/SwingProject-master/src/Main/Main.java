/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import GUI.deliveryHandling;
import GUI.welcome1;
import java.awt.IllegalComponentStateException;

/**
 *
 * @author lahir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        welcome1 wl = new welcome1();
       wl.setExtendedState(welcome1.MAXIMIZED_BOTH);
       wl.setVisible(true);
        
    }
    
}
