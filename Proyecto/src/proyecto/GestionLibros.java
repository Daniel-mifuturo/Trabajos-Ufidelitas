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
    private Libro[] librosEliminados;
    private int contadorLibros = 0;
    private int contadorEliminados = 0;
        
    
    public GestionLibros (int capacidad){
        libros = new Libro[capacidad];
        librosEliminados = new Libro [capacidad];
    }
    //agregar libros y validacion
    public void agregarLibro (){
        //validaciones nulas o vacio
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
        if (isbn == null || isbn.equals("")){
            JOptionPane.showMessageDialog(null, "Error: Entrada inválida.");
            return;
        }
        if (!Libro.validarIsbn(isbn)){
            JOptionPane.showMessageDialog(null, "Error: ISBN inválido. Debe tener 13 dígitos y comenzar con los números 978 o 979");
            return;
        }
        //validar si el ISBN ya existe en la lista
        for (int i=0; i < contadorLibros;i++){
            if (libros[i]!=null && libros[i].getIsbn().equals(isbn)){
                JOptionPane.showMessageDialog(null, "Error: ISBN "+isbn+" ya ha sido registrado en la base de datos");
                return;
            }
        }
        //agregar libro
        String titulo = JOptionPane.showInputDialog("Ingrese el título:");
        String autor = JOptionPane.showInputDialog("Ingrese el autor:");
        TipoEstado estado = TipoEstado.DISPONIBLE;
        libros[contadorLibros++] = new Libro(isbn,titulo,autor,estado);
        JOptionPane.showMessageDialog(null, "Libro agregado a la base de datos.");
    }
    //Consultar libro ISBN o titulo
    
    public void consultarLibro(){
        String opcion = JOptionPane.showInputDialog(null, "Ingrese el ISBN o título a consultar:");
        for(int i=0;i<contadorLibros;i++){
            if(libros[i] != null && libros[i].coincideCon(opcion)){
                JOptionPane.showMessageDialog(null, libros[i].toString());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Error: Libro no encontrado");
    }   
    //Eliminar libro ISBN
    
    public void eliminarLibro(){
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro a eliminar:");
        if (isbn == null || isbn.equals("")){
            JOptionPane.showMessageDialog(null, "Error: Entrada inválida.");
            return;
        }
        if (!Libro.validarIsbn(isbn)){
            JOptionPane.showMessageDialog(null, "Error: ISBN inválido. Debe tener 13 dígitos y comenzar con los números 978 o 979");
            return;
        }

        for (int i = 0; i < contadorLibros; i++){
            if (libros[i] != null && libros[i].getIsbn().equals(isbn)){
                String confirmacion = JOptionPane.showInputDialog("¿Está seguro que desea eliminar el libro?\nEscriba 'SI' para confirmar");
                if(confirmacion!=null && confirmacion.equalsIgnoreCase("SI")){
                    librosEliminados[contadorEliminados++] = libros[i];
                    libros[i] = null;
                    JOptionPane.showMessageDialog(null, "Libro eliminado correctamente.");
                }else{
                    JOptionPane.showMessageDialog(null, "Operación cancelada");
                }
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Error: Libro no encontrado.");
    }
    
    //Cambiar estado libro
    
    public void cambiarEstadoLibro(){
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
        if (isbn == null || isbn.equals("")){
            JOptionPane.showMessageDialog(null, "Error: Entrada inválida.");
            return;
        } 
        if (!Libro.validarIsbn(isbn)){
            JOptionPane.showMessageDialog(null, "Error: ISBN inválido. Debe tener 13 dígitos y comenzar con los números 978 o 979");
            return;
        }
               
        for(int i=0;i<contadorLibros;i++){
            if(libros[i]!=null && libros[i].getIsbn().equals(isbn)){
                String seleccion = JOptionPane.showInputDialog(
                "Seleccione el nuevo tipo de estado libro:\n"+
                "1. DISPONIBLE\n"+        
                "2. PRESTADO\n");
                if (seleccion == null || !seleccion.matches("[1-2]")){
                    JOptionPane.showMessageDialog(null, "Error: Entrada inválida. Debe ingresar un número entre 1 o 2");
                    return;
                }
                
                int opcion = Integer.parseInt(seleccion);
                TipoEstado nuevoEstado = null;
                
                switch(opcion){
                    case 1:
                        nuevoEstado = TipoEstado.DISPONIBLE;
                        break;
                    case 2:
                        nuevoEstado = TipoEstado.PRESTADO;
                        break;
                    }
                libros[i].cambiarEstado(nuevoEstado);
                JOptionPane.showMessageDialog(null, "Estado actualizado a:"+nuevoEstado);
            }else{
                JOptionPane.showMessageDialog(null, "Error: Libro no encontrado"); 
            }
        }
    }
    //Visualización de libros (todos, por estado o búsqueda específica)
    
    public void visualizarLibros(){
        String seleccion = JOptionPane.showInputDialog(
            "Visualización de libros\n"+
            "1. Mostrar todos los libros\n"+
            "2. Mostrar libros por estado\n"+
            "3. Buscar libro por ISBN o título\n\n"+
            "Seleccione una opcion:");
        
        if (seleccion==null || seleccion.equals(""))return;
        
        int opcion = Integer.parseInt(seleccion);
        switch(opcion){
            case 1:
                mostrarLibros();
                break;
            case 2:
                mostrarLibroEstado();
                break;
            case 3:
                buscarLibro();
                break;
            default:
            JOptionPane.showMessageDialog(null, "Opción inválida.");    
        }       
    }
    
    public void mostrarLibroEstado(){
        String estado = JOptionPane.showInputDialog("Ingrese el estado que desea filtrar:\n"+
                "(DISPONIBLE o PRESTADO");
        if (estado == null || estado.equals(""))return;
        
        String resultado = "Libros con estado " + estado + ":\n\n";
        boolean existeEstado = false;
        
        for (int i=0; i<contadorLibros; i++){
            if(libros[i]!=null && libros[i].getEstado().toString().equalsIgnoreCase(estado)){
                resultado += libros[i].toString()+"\n--------------------\n";
                existeEstado = true;
            }
        }
        JOptionPane.showMessageDialog(null, existeEstado ? resultado:"No hay libros registrados con ese estado");
    }
    
    public void mostrarLibros() {
        String resultado = "Lista de todos los libros:\n\n";
        boolean existenlibros = false;

        for (Libro v : libros) {
            if (v != null) {
                resultado += v.toString() + "\n\n";
                existenlibros = true;
            }
        }

        if (!existenlibros) {
            JOptionPane.showMessageDialog(null, "No hay libros registrados.");
        } else {
            JOptionPane.showMessageDialog(null, resultado);
        }
    }
    
    public void buscarLibro(){
        String isbn = JOptionPane.showInputDialog(null, "Ingrese el ISBN o título a consultar:");
        if (isbn == null || isbn.equals("")){
            JOptionPane.showMessageDialog(null, "Error: Entrada inválida.");
            return;
        } 
                
        for (int i=0; i<contadorLibros; i++){
            if (libros[i]!=null && libros[i].coincideCon(isbn)){
                JOptionPane.showMessageDialog(null, "Resultados de busqueda: \n\n"+libros[i].toString());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Error: Libro no encontrado");
    }
}

