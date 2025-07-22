/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Grupo7
 */
public class GestionPrestamos {
    
       private static final String ARCHIVO_PRESTAMOS = "prestamos.txt";
       private static final DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       
       //Registrar prestamo
       public static void registrarPrestamo(GestionLibros gestionLibros){
         String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro a prestar: ");
         String estudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
         Libro libro = gestionLibros.buscarPorISBN(isbn);
         
         if(libro == null){
         JOptionPane.showMessageDialog(null, "Libro no encontrado. ");
         return;
         
         }
         
         if(libro.getEstado() != TipoEstado.DISPONIBLE){
            JOptionPane.showMessageDialog(null, "Libro no esta disponible para prestamo. ");
            return;
         }
         
         libro.setEstado(TipoEstado.PRESTADO);
         
         String fechaPrestamo = LocalDateTime.now().format(formatoFecha);
         String registro = "ISBN"+isbn+"; Titulo: "+libro.getTitulo()+
                           " Estudiante: "+estudiante+
                           " Fecha prestamo: "+fechaPrestamo+"\n";
         
         escribirEnArchivo(ARCHIVO_PRESTAMOS, registro, true);
          JOptionPane.showMessageDialog(null, "Prestamo registrado exitosamente. ");
       }
       
       //Devoluciones
       public static void registrarDevolucion(GestionLibros gestionLibros){
         String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro a devolver: ");
         
         Libro libro = gestionLibros.buscarPorISBN(isbn);
         
         if(libro == null){
         JOptionPane.showMessageDialog(null, "Libro no encontrado. ");
         return;
         
         }
         
         if(libro.getEstado() != TipoEstado.PRESTADO){
            JOptionPane.showMessageDialog(null, "Este libro no esta marcado como prestado ");
            return;
         }
         libro.setEstado(TipoEstado.DISPONIBLE);
         
         String fechaDevolucion = LocalDateTime.now().format(formatoFecha);
         String registro = "ISBN"+isbn+"; Titulo: "+libro.getTitulo()+
                           " Fecha prestamo: "+fechaDevolucion+"\n";
         
         escribirEnArchivo(ARCHIVO_PRESTAMOS, registro, true);
         JOptionPane.showMessageDialog(null, "Devolucion registrado exitosamente. ");
         
       }
       
       //Consultar prestamos
       public static void consultarPrestamosPorEstudiante(String nombreArchivo, String nombreEstudiante) {
    String contenido = leerArchivo(nombreArchivo);
    String[] lineas = contenido.split("\n");
    StringBuilder resultado = new StringBuilder();

    for (String linea : lineas) {
        if (linea.toLowerCase().contains(nombreEstudiante.toLowerCase())) {
            resultado.append(linea).append("\n");
        }
    }

    JOptionPane.showMessageDialog(null, resultado.length() > 0 ? resultado.toString() : "No se encontraron préstamos para el estudiante.");
}
       
       //Prestamos por ISBN
       public static void consultarPrestamosPorISBN(String nombreArchivo, String isbn) {
    String contenido = leerArchivo(nombreArchivo);
    String[] lineas = contenido.split("\n");
    StringBuilder resultado = new StringBuilder();

    for (String linea : lineas) {
        if (linea.contains(isbn)) {
            resultado.append(linea).append("\n");
        }
    }

    JOptionPane.showMessageDialog(null, resultado.length() > 0 ? resultado.toString() : "No se encontraron préstamos para el ISBN.");
}

       
       
       
        public static void escribirEnArchivo(String nombreArchivo, String contenido, boolean append){
            FileWriter escritor = null;
            try {
                escritor = new FileWriter(nombreArchivo, append);
                escritor.write(contenido);
                escritor.close();
                } catch (IOException ex) {
                    Logger.getLogger(GestionPrestamos.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                try {
                    escritor.close();
                    } catch (IOException ex) {
                        Logger.getLogger(GestionPrestamos.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
        }
       
        public static String leerArchivo(String nombreArchivo) {
            StringBuilder contenido = new StringBuilder();
            try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
                String linea;
            while ((linea = lector.readLine()) != null) {
                contenido.append(linea).append("\n");
                }
            } catch (IOException ex) {
                Logger.getLogger(GestionPrestamos.class.getName()).log(Level.SEVERE, null, ex);
                }
            return contenido.toString();
            }
}
       


