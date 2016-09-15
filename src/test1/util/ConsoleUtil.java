/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author tom
 */
public class ConsoleUtil {

    public static int lireInt(String message) throws IOException {
        String str =Liretexte(message);
        return Integer.valueOf(str);
    }
    public static String lireTexte(String message) throws IOException {
        DataInputStream clavier = new DataInputStream(System.in);
        System.out.print(message);
        String texte = clavier.readLine();
        return texte;
    }

    public static int lireEntier(String veuillez_saisir_la_colonne__) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
