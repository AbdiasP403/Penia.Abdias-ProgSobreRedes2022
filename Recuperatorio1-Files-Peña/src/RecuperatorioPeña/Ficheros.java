package RecuperatorioPeña;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * ESTA PARTE VA A ESTAR EN LA HOJA HTML. Esto tamibien va a estar en el HTML,
 * pero en la parte de la descripcion (aca puse ENTER) de la clase no como
 * titular, y aca podemos dar una (aca puse ENTER) descripcion Gral. del uso y
 * funcionamiento de esta CLASS.
 *
 * @author Software-Notebook
 * @version %I%, %G%
 * @serial
 * @since v1.0
 */
public class Ficheros {

    File archivo;
    PrintStream ps;

    public Ficheros() {
        ps = new PrintStream(System.out);

        //Si no existe es la forma de CREAR el archivon(vale para carpeta tambien)
        //archivo = new File("C:\\Users\\"
        //        + "Software-Notebook\\Desktop\\MiArchivo.exe");
        //archivo = new File("MiArchivito.dat");
        archivo = new File("\\\\SOFTWARE-NOTEBO\\Users\\Public\\datos.cvs");

   
        try {
            ps.println(LeerFileConBuffer(archivo));
        } catch (IOException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @param f
     */
    public void crearFileConBuffer(File f) {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);

            bw.write("");
            bw.newLine();
            bw.write("");
            bw.flush();

        } catch (IOException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }

                if (bw != null) {
                    bw.close();
                }

            } catch (IOException ex) {
                Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Descripcion
     *
     * @param f un archivo al leer
     * @return Todo el texto leido.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public String LeerFileConBuffer(File f) throws FileNotFoundException, IOException {
        FileReader FileReader = new FileReader(f);
        BufferedReader br = new BufferedReader(FileReader);

        String linea = "", texto = "";
        while ((linea = br.readLine()) != null) {
            texto += "\n" + linea;
        }

        br.close();
        FileReader.close();

        return texto;
    }

}