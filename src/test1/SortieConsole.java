/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author tom
 */
public class SortieConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Bonjour tout le monde");
        System.out.println(    1 + 2 * 3    );

        DataInputStream in = new DataInputStream(System.in);
        
        String txt = in.readLine();
        System.out.println(txt);
    }
    
}
