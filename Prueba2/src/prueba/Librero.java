/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Redes05
 */
public class Librero implements Serializable{
    private static final long serialVersionUID = -1000L;
    private LinkedList<Articulos> articulos;

    public Librero() {
        articulos = new LinkedList<>();
    }
    
    public void agregarArticulo(Articulos a){
        if (a != null) {
            articulos.add(a);
        }
    }
    
    public Articulos devolverArticulo(int i){
        Articulos aux = articulos.get(i);
        return aux;
    }

    public LinkedList<Articulos> getArticulos() {
        return articulos;
    }

    public void setArticulos(LinkedList<Articulos> articulos) {
        this.articulos = articulos;
    }
    
    
    
}
