/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        
        Sistemita s = new Sistemita();
        String archivo = "datos.bin";
        
        try
        {
            s = s.deSerializar( archivo );
            Utilidades.mostrarPorPantalla("VIEJO");
            s.creacion();
            
        }catch( IOException | ClassNotFoundException ex ){
            Utilidades.mostrarPorPantalla("NUEVO");
        }finally{
            s.prender();
        }
        
    }
    
}
