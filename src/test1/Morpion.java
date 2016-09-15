/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;


import test1.util.MathUtil1;

/**
 *
 * @author admin
 */
public class Morpion {

    public static void main(String[] args) {

        int[][] plateau = new int[3][3];

        for (int indiceLin = 0; indiceLin < plateau.length; indiceLin++) {

            for (int indiceCol = 0; indiceCol < plateau.length; indiceCol++) {
            plateau[indiceLin][indiceCol]=1 ;
               
                System.out.print(plateau [indiceLin] [indiceCol]); 
                
            }
            System.out.println();
            
        }
        
    }
}
