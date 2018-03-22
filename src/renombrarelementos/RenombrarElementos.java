/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renombrarelementos;

import java.io.File;

/**
 *
 * @author Lorenzo
 */
public class RenombrarElementos {

    private void imprimirArchivos(String cadena) {
        File archivo = new File(cadena);
        if (archivo.isFile()) {
            System.out.println(archivo.getPath());
        } else if (archivo.isDirectory()) {
          for(String carpeta : archivo.list())
             imprimirArchivos(cadena + archivo.separator + carpeta);
        }
        if (!archivo.exists())
          System.out.println(cadena + " does not exist.");
    }
    
}
