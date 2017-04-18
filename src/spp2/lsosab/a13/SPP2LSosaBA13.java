/*
 * Fernanda Sosa
 * IIS
 * A01411485
 */
package spp2.lsosab.a13;
import javax.swing.*;
/**
 *
 * @author Fernanda
 */
public class SPP2LSosaBA13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double e= solicitarD("la estatura (cm)");
        double p= solicitarD("el peso (kg) ");
        
        double imc= p / Math.pow((e/100),2);
        JOptionPane.showMessageDialog(null, "Tu imc es: " + imc);
        
        
    }
    

static double solicitarD (String msj){
        double dato;
         boolean test;
              do {
                  String usuario= JOptionPane.showInputDialog(null,"Introduce " + msj);
            try {
                
                dato=Integer.parseInt(usuario);
                test=false;
                 }
            catch (Exception ex) {
                test=true;
                JOptionPane.showMessageDialog(null,"Tu dato no es entero, muere :)");
            }   
        dato=Integer.parseInt(usuario);   
     } while (test);              
        return dato; 
    }
        
    }
           
    
    
    
    
    
    


