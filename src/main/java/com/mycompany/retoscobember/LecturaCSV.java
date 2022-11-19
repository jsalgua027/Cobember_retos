/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retoscobember;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Windows10
 */
public class LecturaCSV {

    public class LeerFicherosTexto {

        public static void main(String[] args) {
// Fichero a leer
            String idFichero = "codemberUsers.txt";
// Variables para guardar los datos que se van leyendo
            String[] tokens;
            String linea;
            System.out.println("Leyendo el fichero: " + idFichero);
// Inicialización del flujo "datosFichero" en función del archivo llamado "idFichero"
// Estructura try-with-resources. Permite cerrar los recursos una vez finalizadas
// las operaciones con el archivo
            try ( Scanner datosFichero = new Scanner(new FileReader(idFichero))) {
                System.out.println("Separando cada elemento del fichero: ");

                while (datosFichero.hasNextLine()) {
                    linea = datosFichero.nextLine();
// Se guarda en el array de String cada elemento de la
// línea en función del carácter separador coma
                    tokens = linea.split(" ");
                    for (String string : tokens) {
                        System.out.print(string + "\t");
                    }
                    System.out.println();
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

