package introducciónProgramacion;

import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class IntroducirClave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String clave="televisor";
        String pass="";
        while (clave.equals(pass)==false){
            pass=JOptionPane.showInputDialog("introduzca su contraseña");
            if (clave.equals(pass)==false){
                System.out.println("La contraseña ingresada es incorrecta");
            }
        }
        System.out.println("Bienvenido Gonzalo");
        
        
        
        
                
                            
                
        
        
        
    }
    
}
