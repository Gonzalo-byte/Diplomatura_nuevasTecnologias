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
public class ValidacionCorreo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //variables:
       int arroba=0;
       boolean punto=false;
       
        String correo=JOptionPane.showInputDialog("Introduce tu correo electrónico");
        
        //proceso:
       
        for(int a=0; a<correo.length(); a++){
            if (correo.charAt(a)=='@'){
                arroba++;
               
            }
          if(correo.charAt(a)=='.'){
              punto=true;
            
          }  
        }
        if (arroba==1 && punto==true){
            System.out.println("el correo electrónico es correcto");
            
        }
        else{ 
            System.out.println("el correo electrónico es incorrecto");
        }
    }
        
        
        
        
        
    }
    

