/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

public class LibroDAO {
   
    public boolean mostrarMenu() {
        boolean cerrar = false, continuar = true;
        while (!cerrar) {
            char op;
            do {
                Utilidades.mostrarPorPantalla(
                        "MENÚ LIBRO\n\n"
                        + "[1] Cargar\n"
                        + "[2] Actualizar\n"
                        + "[3] Borrar\n"
                        + "[4] Mostrar\n"
                        + "[5] EXIT\n"
                );
                op = Utilidades.obtenerOpcion();
            } while (op < '1' || op > '5');

            switch (op) {
                case '1':
                        // colocar opciones
                    break;
                case '2':
                        // colocar opciones
                    break;
                case '3':
                        // colocar opciones
                    break;
                case '4':
                        // colocar opciones
                    break;
                case '5':
                    cerrar = true;
                    continuar = false;
                    break;
            }
        }
        return continuar;
    }
}
