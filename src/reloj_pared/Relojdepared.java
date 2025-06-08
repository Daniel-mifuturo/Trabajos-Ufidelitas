/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reloj_pared;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Solorzano Damaceno
 */
public class Relojdepared {
     //Atributos
    int hora, minutos;
    String material, marca;
    
    //Metodos
    public Relojdepared(){}
    
    //public/private tiporetorno nombremetodo (parametros)(bloquedecodigo)
    public void infoRelojdepared(){// sin retorno
        JOptionPane.showMessageDialog(null,"Marca: "+this.marca+"\nMaterial: "+this.material
                +"\nHora: "+this.hora+"\nMinutos: "+this.minutos);
        
                      
    }
    
    public String infoRelojdepared2(){// con retorno
        return "Marca: "+this.marca+"\nMaterial: "+this.material
                +"\nHora: "+this.hora+"\nMinutos: "+this.minutos ;
    
    
    }
    
    //Gets y sets
    public String  demeMarca(){
        return this.marca;
    }
    
    public boolean esHoraInt (int pHora){
        if(this.hora<pHora){
            return true;
        }else{
            return false;
            
        }
        
    }
            
    /*public boolean esAMPMInt (int pHora){
            return this.edad>pEdad ;
            */
    
    public boolean esHoradiferente (Relojdepared p){
        if(this.hora<hora){
            return true;
        }else{
            return false;    
            
        }
    }
        
    public boolean esMarcadiferente (Relojdepared p){
        return this.marca!=marca;
        
    }
    
    public String esMaterialdiferente (Relojdepared p){
        return this.material;
        
    }
    
    
}
