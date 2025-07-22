/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author ramie
 */
public class Prestamo {
    private String isbnLibro;
    private String tituloLibro;
    private String nombreEstudiante;
    private String fechaHoraPrestamo;
    
public Prestamo(String isbnLibro, String tituloLibro, String nombreEstudiante, String fechaHoraPrestamo){
       this.isbnLibro = isbnLibro;
       this.tituloLibro = tituloLibro;
       this.nombreEstudiante = nombreEstudiante;
       this.fechaHoraPrestamo = fechaHoraPrestamo;
    }
    
public String getIsbnLibro(){
 return isbnLibro;
} 

public String getTituloLibro(){
 return tituloLibro;
}  

public String getNombreEstudiante(){
 return nombreEstudiante;
}  

public String getFechaHoraPrestamo(){
 return fechaHoraPrestamo;
}  


    @Override
    public String toString(){
      return "ISBN: "+isbnLibro+
             "Titulo: "+tituloLibro+
             "Estudiante: "+nombreEstudiante+
             "Fecha Prestamo: "+fechaHoraPrestamo;
}
    
}
