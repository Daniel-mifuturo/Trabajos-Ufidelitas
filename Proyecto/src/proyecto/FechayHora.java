/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author ramie
 */
public class FechayHora {
    public static void Horafecha(){
        LocalDateTime fechaHora = LocalDateTime.now(); 
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String resultado = fechaHora.format(formato);
        JOptionPane.showMessageDialog(null, "Fecha y hora actual: "+resultado);
    
    
    }
}
