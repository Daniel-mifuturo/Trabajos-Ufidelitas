/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 7
 */
public class Proyecto { 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                        
        int opcionPrincipal;
        do {
            String seleccion = JOptionPane.showInputDialog(
                " MENÚ PRINCIPAL\n" +
                "1. Administrar Libros\n" +
                "2. Préstamos y Devoluciones\n" +
                "3. Consultar\n" +
                "4. Ver Fecha y Hora\n" +
                "5. Salir\n\n" +
                "Seleccione una opción:"
            );

            if (seleccion == null) break; 

            opcionPrincipal = Integer.parseInt(seleccion);

            switch (opcionPrincipal) {
                case 1:
                    administrarLibros();
                    break;
                case 2:
                    prestamosDevoluciones();
                    break;
                case 3:
                    consultarLibros();
                    break;
                case 4:
                    FechayHora.mostrarHorafecha();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema. ¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } while (opcionPrincipal != 5);
    }

    public static void administrarLibros() {
        GestionLibros gestion=new GestionLibros(100);
        GestionLibros gestione=new GestionLibros(200);
        int opcion;

        do {
            String seleccion = JOptionPane.showInputDialog(
                " ADMINISTRAR LIBROS\n" +
                "1. Agregar Libro\n" +
                "2. Modificar Libro\n" +
                "3. Eliminar Libro\n" +
                "4. Volver al Menú Principal\n\n" +
                "Seleccione una opción:"
            );

            if (seleccion == null) break;

            opcion = Integer.parseInt(seleccion);

            switch (opcion) {
                case 1:
                    gestion.agregarLibro();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Modificar Libro");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Eliminar Libro");
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } while (opcion != 4);
    }

    public static void prestamosDevoluciones() {
        int opcion;

        do {
            String seleccion = JOptionPane.showInputDialog(
                " PRÉSTAMOS Y DEVOLUCIONES\n" +
                "1. Realizar Préstamo\n" +
                "2. Realizar Devolución\n" +
                "3. Volver al Menú Principal\n\n" +
                "Seleccione una opción:"
            );

            if (seleccion == null) break;

            opcion = Integer.parseInt(seleccion);

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Realizar Préstamo");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Realizar Devolución");
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } while (opcion != 3);
    }

    public static void consultarLibros() {
        int opcion;

        do {
            String seleccion = JOptionPane.showInputDialog(
                " CONSULTAR LIBROS\n" +
                "1. Consultar por Título\n" +
                "2. Consultar por Autor\n" +
                "3. Mostrar Todos los Libros\n" +
                "4. Volver al Menú Principal\n\n" +
                "Seleccione una opción:"
            );

            if (seleccion == null) break;

            opcion = Integer.parseInt(seleccion);

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Consultar por Título");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Consultar por Autor");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Mostrar Todos los Libros");
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } while (opcion != 4);
    }
}
    
       
        
      
       
        
    
    

