/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecp01;
import javax.swing.JOptionPane;
/**
 *
 * @author Daniel Solorzano Damaceno
 */
public class ECP01 {

    public static void main(String[] args) {
        
        
        Paquete paquete = new Paquete();
        int opcion;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n"+
                    "1.Ingresar/Modificar datos del paquete\n2.Mostrar datos del paquete\n3.Calcular y mostrar costo de envio"
                    +"\n4.Mostrar tarifas"+"\n5.Salir\n"));
            switch(opcion){
                case 1:
                    paquete.setDestino(JOptionPane.showInputDialog("Destino: "));
                    paquete.setPesoKg(Double.parseDouble(JOptionPane.showInputDialog("Peso (kg): ")));
                    paquete.setPrioridad(Paquete.Prioridad.valueOf(JOptionPane.showInputDialog("Prioridad (Digite el tipo de envio deseado: " 
                            +"\nUrgente/Normal/Baja)")));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, paquete.toString());
                    break;
                case 3:
                    double costo = paquete.calcularCostoEnvio();
                    JOptionPane.showMessageDialog(null, "Costo de envio: $" +costo);
                    break;
                case 4:
                    Paquete.mostrarTarifas();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Fin del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no es valida");
                
            }
        
        }while(opcion!=5);
    }
}
    








    
    
    
    


    




