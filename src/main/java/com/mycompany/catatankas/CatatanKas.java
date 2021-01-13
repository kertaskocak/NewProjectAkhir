/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.catatankas;

/**
 *
 * @author ASUS
 */
public class CatatanKas {
    
     /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        RegisterView register = new RegisterView();
        register.setLocationRelativeTo(null); 
        register.setVisible(true); 
        register.pack();
        register.setDefaultCloseOperation(RegisterView.EXIT_ON_CLOSE);
    }
    
}
