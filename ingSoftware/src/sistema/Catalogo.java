/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Catalogo {
     private String especialidad ;
     private ArrayList<Libro> libros ;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Catalogo(String especialidad) {
        this.especialidad = especialidad;
        libros =new ArrayList ();
    }
    
    public void  agregarLibroADD (Libro  libro ){
    
    libros.add(libro);
    
    
    }
    
      public void  agregarLibro (String titulo ,String resumen ,String nombreEditorial ){
    
    Editorial editorial = new Editorial (nombreEditorial );
    Libro libro =new Libro  (titulo ,resumen , editorial );
    
    
    }
   
    public int calcularLibros()
    {
        return libros.size();
    }
    
    
    
}
