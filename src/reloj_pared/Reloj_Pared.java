/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reloj_pared;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Solorzano Damaceno
 */
public class Reloj_Pared {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Relojdepared reloj1, reloj2, reloj3, reloj4;
        
        reloj1 = new Relojdepared(); //Constructor
        reloj2 = new Relojdepared();
        reloj3 = new Relojdepared();
        reloj4 = new Relojdepared();
        
     
          
        
        reloj1.marca="Casio";
        reloj1.hora=8;
        reloj1.minutos=25;
        reloj1.material="Plastico";
        
        reloj2.marca="Seiko";
        reloj2.hora=10;
        reloj2.minutos=45;
        reloj2.material="Oro";
        
        reloj3.marca="Rolex";
        reloj3.hora=11;
        reloj3.minutos=55;
        reloj3.material="Plata y Oro";
        
        reloj4.marca="Swatch";
        reloj4.hora=23;
        reloj4.minutos=55;
        reloj4.material="Bronze";
        
        JOptionPane.showMessageDialog(null,reloj1.infoRelojdepared2());
        
        JOptionPane.showMessageDialog(null,reloj2.infoRelojdepared2());
        
        JOptionPane.showMessageDialog(null,reloj3.infoRelojdepared2());
        
        JOptionPane.showMessageDialog(null,reloj4.infoRelojdepared2());
        
        JOptionPane.showMessageDialog(null,reloj2.esHoradiferente(reloj1));
        
        JOptionPane.showMessageDialog(null,reloj1.esHoraInt(reloj2.hora));
        
        JOptionPane.showMessageDialog(null,reloj3.esMarcadiferente(reloj4));
        
        JOptionPane.showMessageDialog(null,reloj4.esMaterialdiferente(reloj3));
        
        
        
    }
    
}
