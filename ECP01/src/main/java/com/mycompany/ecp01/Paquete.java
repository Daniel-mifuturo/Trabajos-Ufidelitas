/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecp01;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Solorzano Damaceno
 */
public class Paquete {
    
    private String destino;
    private double pesoKg;
    private Prioridad prioridad;
 
    
   //Enumeracion 
 public enum Prioridad{
 Urgente, Normal, Baja
 
 }
    
      
    //Constructor
    
    public Paquete (String destino, double pesoKg, Prioridad prioridad){
        this.destino = destino;
        this.pesoKg = pesoKg;
        this.prioridad = prioridad;
        
    }
    
    public Paquete (){
        this.destino= "Desconocido";
        this.pesoKg= 0.0;
        this.prioridad=Prioridad.Normal; 
        
    }
        
    //Getters y Setters
    
    public String getDestino(){
        return destino;
        
    }
    
    public void setDestino(String destino){
        this.destino = destino;
        
    }
    
    public double getPesoKg(){
        return pesoKg;
        
    }
    
    public void setPesoKg(double pesoKg){
        this.pesoKg = pesoKg;
        
    }
    
    public Prioridad getPrioridad(){
        return prioridad;
        
    }
        
  public void setPrioridad (Prioridad prioridad){
      this.prioridad = prioridad;
      
  }
  
  //Metodo
  
  public double calcularCostoEnvio(){
      switch(prioridad){
          case Urgente:
              return pesoKg * 10;
          case Normal:
              return pesoKg * 5;
          case Baja:
              return pesoKg * 2.5;
          default:
              return 0;
              
      }
 }
  
 public static void mostrarTarifas(){
     String tarifas = "***** Tarifas de Envio *****\n"+"Urgente: $10 por kg\n"+"Normal: $5 por kg\n"
             +"Baja: $2.5 por kg";
     JOptionPane.showMessageDialog(null, tarifas);
             
 }
  
 @Override
public String toString(){
    return "Destino:" + destino + "\nPeso: " + pesoKg + " kg" + "\nPrioridad: " + prioridad;
} 
    
   
    
    

   
   
}
    

