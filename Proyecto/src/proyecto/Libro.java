/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Grupo 7
 */
public class Libro {
    
    private String isbn;
    private String titulo;
    private String autor;
    private String estado;
    
    
    //constructor
    public Libro(String isbn, String titulo, String autor){
       this.isbn = isbn;
       this.titulo = titulo;
       this.autor = autor;
       this.estado = "Disponible";
    }
       
    //getters
       public String getIsbn(){
         return isbn;
       }
       
       public String getTitulo(){
         return titulo;
       }  

       public String getAutor(){
         return autor;
       }  

       public String getEstado(){
         return estado;
       } 
       
       
     //setters
     
  public void setIsbn(String isbn){
    this.isbn = isbn;
  }
  
  public void setTitulo(String titulo){
    this.titulo = titulo;
  }
    
  public void setAutor(String autor){
    this.autor = autor;
  }
  
  //Cambiar estado del libro
  public void setEstado(String estado){
      if (estado.equalsIgnoreCase("Disponible") || estado.equalsIgnoreCase("Prestado")){
    this.estado = estado;
  }else{
            System.out.println("Estado no valido. Debe ser Disponible o Prestado.");
      }
  }
  
  // validar el ISBN
  public static boolean validarIsbn(String isbn){
  if (isbn == null || isbn.length() != 13){
       return false;
  }
     return isbn.startsWith("978") || isbn.startsWith("979");
  }
  
  
  //Mostrar objeto libro
  
  public String toString(){
    return "ISBN:"+ isbn+ "\n"+
           "Titulo:"+ titulo+ "\n"+
           "Autor:"+ autor+ "\n"+
           "Estado:"+ estado;
  }



}
