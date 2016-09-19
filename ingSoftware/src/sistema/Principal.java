/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String   opcion;
        String nombre="";
        String titulo="";
        String resumen="";
        String especialidad="";
        ArrayList<Libro> libro = null;
        libro = new ArrayList();
        System.out.println("Desea ingresar libros s/n: ");
        opcion = entrada.nextLine();
        do
        {            
            System.out.println("Ingrese nombre de la editorial");
            nombre = entrada.nextLine();
            System.out.println("Ingrese título del libro");
            titulo = entrada.nextLine();
            System.out.println("Ingrese resumen del libro");
            resumen = entrada.nextLine();
            System.out.println("Ingrese especialidad");
            especialidad = entrada.nextLine(); 
        Editorial editorial = new Editorial(nombre);
        Libro libros = new Libro(titulo, resumen, editorial);
       
        libro.add(libros); 
        Catalogo catalogo = new Catalogo(especialidad);
        System.out.println("Agregar libros");
        catalogo.agregarLibro(titulo, resumen, nombre);
        System.out.println("Desea ingresar libros s/n: ");
        opcion = entrada.nextLine();
        }while("s".equals(opcion));        
        System.out.println("Calculo de libros"+libro.size()); 
    }
    
}
