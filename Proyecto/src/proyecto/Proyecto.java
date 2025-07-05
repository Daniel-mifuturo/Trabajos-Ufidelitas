/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;
import static proyecto.FechayHora.mostrarHorafecha;

/**
 *
 * @author Grupo 7
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mostrarMenuPrincipal();
    }

    public static void mostrarMenuPrincipal() {
        String seleccion = JOptionPane.showInputDialog(
            " MENÚ PRINCIPAL\n" +
            "1. Administrar Libros\n" +
            "2. Préstamos y Devoluciones\n" +
            "3. Consultar\n" +
            "4. Ver Fecha y Hora\n" +
            "5. Salir\n\n" +
            "Seleccione una opción:"
        );

        if (seleccion.equals("1")) {
            mostrarMenuAdministrarLibros();
        } else if (seleccion.equals("2")) {
            mostrarMenuPrestamosDevoluciones();
        } else if (seleccion.equals("3")) {
            mostrarMenuConsultar();
        } else if (seleccion.equals("4")) {

            mostrarHorafecha();
            mostrarMenuPrincipal();
        } else if (seleccion.equals("5")) {
            JOptionPane.showMessageDialog(null, "Gracias por usar el sistema. ¡Hasta luego!");
        } else {
            JOptionPane.showMessageDialog(null, "Opción inválida.");
            mostrarMenuPrincipal();
        }
    }

    public static void mostrarMenuAdministrarLibros() {
        String seleccion = JOptionPane.showInputDialog(
            " ADMINISTRAR LIBROS\n" +
            "1. Agregar Libro\n" +
            "2. Modificar Libro\n" +
            "3. Eliminar Libro\n" +
            "4. Volver al Menú Principal\n\n" +
            "Seleccione una opción:"
        );

        if (seleccion.equals("1")) {
            JOptionPane.showMessageDialog(null, "Funcionalidad: Agregar Libro");
            mostrarMenuAdministrarLibros();
        } else if (seleccion.equals("2")) {
            JOptionPane.showMessageDialog(null, "Funcionalidad: Modificar Libro");
            mostrarMenuAdministrarLibros();
        } else if (seleccion.equals("3")) {
            JOptionPane.showMessageDialog(null, "Funcionalidad: Eliminar Libro");
            mostrarMenuAdministrarLibros();
        } else if (seleccion.equals("4")) {
            mostrarMenuPrincipal();
        } else {
            JOptionPane.showMessageDialog(null, "Opción inválida.");
            mostrarMenuAdministrarLibros();
        }
    }

    public static void mostrarMenuPrestamosDevoluciones() {
        String seleccion = JOptionPane.showInputDialog(
            " PRÉSTAMOS Y DEVOLUCIONES\n" +
            "1. Realizar Préstamo\n" +
            "2. Realizar Devolución\n" +
            "3. Volver al Menú Principal\n\n" +
            "Seleccione una opción:"
        );

        if (seleccion.equals("1")) {
            JOptionPane.showMessageDialog(null, "Funcionalidad: Realizar Préstamo");
            mostrarMenuPrestamosDevoluciones();
        } else if (seleccion.equals("2")) {
            JOptionPane.showMessageDialog(null, "Funcionalidad: Realizar Devolución");
            mostrarMenuPrestamosDevoluciones();
        } else if (seleccion.equals("3")) {
            mostrarMenuPrincipal();
        } else {
            JOptionPane.showMessageDialog(null, "Opción inválida.");
            mostrarMenuPrestamosDevoluciones();
        }
    }

    public static void mostrarMenuConsultar() {
        String seleccion = JOptionPane.showInputDialog(
            " CONSULTAR LIBROS\n" +
            "1. Consultar por Título\n" +
            "2. Consultar por Autor\n" +
            "3. Mostrar Todos los Libros\n" +
            "4. Volver al Menú Principal\n\n" +
            "Seleccione una opción:"
        );
        
        if (seleccion.equals("1")) {
            JOptionPane.showMessageDialog(null, "Funcionalidad: Consultar por Título");
            mostrarMenuConsultar();
        } else if (seleccion.equals("2")) {
            JOptionPane.showMessageDialog(null, "Funcionalidad: Consultar por Autor");
            mostrarMenuConsultar();
        } else if (seleccion.equals("3")) {
            JOptionPane.showMessageDialog(null, "Funcionalidad: Mostrar Todos los Libros");
            mostrarMenuConsultar();
        } else if (seleccion.equals("4")) {
            mostrarMenuPrincipal();
        } else {
            JOptionPane.showMessageDialog(null, "Opción inválida.");
            mostrarMenuConsultar();
        }
    }
    

}
        
      
       
        
    
    

