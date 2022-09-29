/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.sql.Date;

public class Libro extends Articulos{
    private Date fechaDeIngreso;
    private String autor;
    private int paginas;

    public Libro(Date fechaDeIngreso, String autor, int paginas, int codigo, String nombre, String genero) {
        super(codigo, nombre, genero);
        this.fechaDeIngreso = fechaDeIngreso;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public void mostrarDatos(){
        Utilidades.mostrarPorPantalla(
                  "libro: \n"
                + "codigo: "        + this.codigo + "\n"
                + "nombre: "        + this.nombre + "\n"
                + "genero: "        + this.genero + "\n"
                + "fecha de ingreso: " + this.fechaDeIngreso + "\n"
                + "autor: "         + this.autor + "\n"
                + "N° de paginas: "       + this.paginas + "\n"
        );
    }
    
}
