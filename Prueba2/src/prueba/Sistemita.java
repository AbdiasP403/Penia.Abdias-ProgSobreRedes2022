/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class Sistemita implements Serializable{
    private static final long serialVersionUID = -1000L;
    private Librero librero;
        
    public Sistemita() {
        librero = new Librero();
    }
    
    public Sistemita deSerializar(String archivo) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(archivo);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Sistemita s = (Sistemita) ois.readObject();
        ois.close();
        fis.close();
        
        return s;
    }

    public void creacion() {
        // agregar archivo a la bdd
    }

    public void serializar(String archivo) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(archivo);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(this);
        oos.close();
    }

    
    /**
     * ESTE PASARIA A SER NUETRO MAIN
     */
    public void prender() {
        // aca vamos a hacer un menu
        boolean corriendo = true;
        
        while( corriendo )
        {
            LibroDAO Dao = new LibroDAO();
            corriendo = Dao.mostrarMenu();    
        }
        Utilidades.mostrarPorPantalla("END PROGRAM");
              
    }
}
