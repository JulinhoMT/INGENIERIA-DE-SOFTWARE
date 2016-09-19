/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

/**
 *
 * @author Administrador
 */
public class Libro {
    private String titulo;
    private String resumen ;
      private Editorial editorial  ;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Libro(String titulo, String resumen, Editorial editorial) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.editorial = editorial;
    }
    

}
