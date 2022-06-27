package RecuperatorioPeña;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class lectura_productos {
    
    InputStreamReader is;
    BufferedReader br;
    PrintStream ps;
    
    public lectura_productos() {
        
        is = new InputStreamReader( System.in );
        br = new BufferedReader( is );
        ps = new PrintStream(System.out);
    }
    
    void leer() {
        
        try {
            String a = br.readLine();
            
            ps.println( a );
            
        } catch (IOException ex) {
            Logger.getLogger(lectura_productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
}
