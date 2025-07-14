/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 7
 */
public class GestionLibros {
    private Libro[] libros;
    private Libro[] libroseliminados;
    private int contadorLibros = 0;
    private int contadorEliminados = 0;
    
    
    public GestionLibros (int capacidad){
        libros = new Libro[capacidad];
        libroseliminados = new Libro [capacidad];
    }
    //agregar libros
    public void agregarLibro (){
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
        if (!Libro.validarIsbn(isbn)){
            JOptionPane.showMessageDialog(null, "Error: ISBN inválido. Debe tener 13 dígitos y comenzar con 978 o 979");
            return;
        }
        String titulo = JOptionPane.showInputDialog("Ingrese el título:");
        String autor = JOptionPane.showInputDialog("Ingrese el autor:");
        TipoEstado estado = TipoEstado.DISPONIBLE;
        libros[contadorLibros++] = new Libro(isbn,titulo,autor,estado);
        JOptionPane.showMessageDialog(null, "Libro agregado a la base de datos.");
    }
    //Consultar libro ISBN
    //Eliminar libro ISBN
    //Cambiar estado libro
    //Ver todos los libros
}
