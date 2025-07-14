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
                "--- Menú Principal ---\n" +
                "1. Administrar Libros\n" +
                "2. Préstamos y Devoluciones\n" +
                "3. Consultar\n" +
                "4. Reportes de Libros\n"+        
                "5. Ver Fecha y Hora\n" +
                "6. Salir\n\n" +
                "Seleccione una opción:" );           

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
                    JOptionPane.showMessageDialog(null, "Funcionalidad = Modulo de Reportes del proyecto en construcción");
                    break;
                case 5:
                    FechayHora.mostrarHorafecha();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el sistema. ¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } while (opcionPrincipal != 6);
    }

    public static void administrarLibros() {
        GestionLibros gestion=new GestionLibros(2000);
        
        int opcion;

        do {
            String seleccion = JOptionPane.showInputDialog(
                "--- Gestión de Libros ---\n" +
                "1. Agregar libro\n" +
                "2. Consultar libro por ISBN o título\n" +
                "3. Eliminar libro\n" +
                "4. Cambiar tipo de estado del libro (Disponible o Prestado)\n"+
                "5. Visualización de libros (todos, por estado o búsqueda específica)\n" +       
                "6. Volver al Menú Principal\n\n" +
                "Seleccione una opción:");            

            if (seleccion == null) break;

            opcion = Integer.parseInt(seleccion);

            switch (opcion) {
                case 1:
                    gestion.agregarLibro();
                    break;
                case 2:
                    gestion.consultarLibro();
                    break;
                case 3:
                    gestion.eliminarLibro();
                    break;
                case 4:
                    gestion.cambiarEstadoLibro();
                    break;
                case 5:
                    gestion.visualizarLibros();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"Regresar al menu principal");
                    break;    
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } while (opcion != 6);
    }

    public static void prestamosDevoluciones() {
        int opcion;
    // El almacenamiento de préstamos se debe realizar en archivo *.txt
        do {
            String seleccion = JOptionPane.showInputDialog(
                "--- Gestión de Préstamos ---\n"+ 
                "1. Registrar préstamos\n" +
                "2. Registrar devoluciones\n" +
                "3. Historial de registro de préstamos\n" +
                "4. Consultas (Por estudiante, por rango de fechas o por ISBN)\n"+        
                "5. Volver al Menú Principal\n\n" +
                "Seleccione una opción:");            

            if (seleccion == null) break;

            opcion = Integer.parseInt(seleccion);

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Registrar préstamos");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Registrar devoluciones");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Historial de registro de préstamos");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Consultas (Por estudiante, por rango de fechas o por ISBN)");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Regresar al menu principal");
                    break;    
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } while (opcion != 5);
    }

    public static void consultarLibros() {
        int opcion;
        //Leer arreglos y archivos para generar reportes
        do {
            String seleccion = JOptionPane.showInputDialog(
                "Reportes\n" +
                "1. Total de libros registrados\n" +
                "2. Total de libros disponibles y total de libros prestados\n" +
                "3. Total de préstamos registrados\n" +
                "4. Total de libros eliminados" +
                "5. Préstamos por estudiante"+ 
                "6. Volver al Menú Principal\n\n"+        
                "Seleccione una opción:");            

            if (seleccion == null) break;

            opcion = Integer.parseInt(seleccion);

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Total de libros registrados");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Total de libros disponibles y total de libros prestados");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Total de préstamos registrados");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Total de libros eliminados");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Funcionalidad: Préstamos por estudiante");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null,"Regresar al menu principal");
                    break;    
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }

        } while (opcion != 6);
    }
}
    
       
        
      
       
        
    
    

