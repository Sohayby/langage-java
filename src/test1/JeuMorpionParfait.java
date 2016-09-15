/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import test1.util.ConsoleUtil;

/**
 *
 * @author admin
 */
public class JeuMorpionParfait {
   
public static void afficherTableau(char tab[][]) {
        System.out.print("**** Morpion ****");
        for (int indiceX = 0; indiceX < tab[0].length; indiceX++) {
            System.out.println("\n-------");
            System.out.print("|");
            for (int indiceY = 0; indiceY < tab.length; indiceY++) {
                System.out.print(tab[indiceX][indiceY] + "|");
            }
        }
        System.out.println("\n-------");
    }

    public static boolean verifierCase(char tab[][], int ligne, int colonne) {
        boolean casePrise;
        if (tab[ligne - 1][colonne - 1] == ' ') {
            casePrise = false;
        } else {
            casePrise = true;
            System.out.println("Case déjà occupée !!!");
        }
        return casePrise;
    }

    public static boolean verifierGagnant(char tab[][]) {
        boolean gagnant = false;
        int colonne = 0;
        int ligne;
        //Verification ligne
        for (ligne = 0; ligne < 3; ligne++) {
            if (tab[ligne][colonne] == tab[ligne][colonne + 1]) {
                if (tab[ligne][colonne] == tab[ligne][colonne + 2]) {
                    if(tab[ligne][colonne] != ' ') gagnant = true;
                }
            }
        }
        //Vérification colonne
        ligne = 0;
        for (colonne = 0; colonne < 3; colonne++) {
            if (tab[ligne][colonne] == tab[ligne +1 ][colonne]) {
                if (tab[ligne][colonne] == tab[ligne+2][colonne]) {
                    if(tab[ligne][colonne] != ' ') gagnant = true;
                }
            }
        }
        //Vérification diagonale 1
        colonne = 0;
        ligne = 0;
            if (tab[ligne][colonne] == tab[ligne+1][colonne + 1]) {
                if (tab[ligne][colonne] == tab[ligne+2][colonne + 2]) {
                    if(tab[ligne][colonne] != ' ') gagnant = true;
                }
            }
       
        //Vérification diagonale 2
        colonne = 0;
        ligne = 2;
            if (tab[ligne][colonne] == tab[ligne-1][colonne + 1]) {
                if (tab[ligne][colonne] == tab[ligne-2][colonne + 2]) {
                    if(tab[ligne][colonne] != ' ') gagnant = true;
                }
            }
      
        return gagnant;
    }

    public static void main(String[] args) throws IOException {
        char[][] tab = new char[3][3];
        int joueur = 2;
        int ligne;
        int colonne;

        //Initialisation du tableau
        for (int indiceX = 0; indiceX < tab[0].length; indiceX++) {
            for (int indiceY = 0; indiceY < tab.length; indiceY++) {
                tab[indiceX][indiceY] = ' ';
            }
        }

        afficherTableau(tab);
       
        //Jeu
    do{
            joueur++;
            if (joueur == 3) joueur = 1;
       
        do {
           
       
                System.out.println("Joueur : " + joueur);
               
                do {
                    ligne = ConsoleUtil.lireEntier("Veuillez saisir la ligne : ");
                    if (ligne < 1 | ligne > 3) {
                        System.out.println("Ligne inexistante !!!");
                    }
                } while (ligne < 1 | ligne > 3);
               
                do {
                    colonne = ConsoleUtil.lireEntier("Veuillez saisir la colonne : ");
                    if (colonne < 1 | colonne > 3) {
                        System.out.println("Colonne inexistante !!!");
                    }
                } while (colonne < 1 | colonne > 3);
               
            } while (verifierCase(tab, ligne, colonne) == true);

            if (joueur == 1) {
                tab[ligne - 1][colonne - 1] = 'O';
            } else {
                tab[ligne - 1][colonne - 1] = 'X';
            }

            afficherTableau(tab);
        } while (verifierGagnant(tab) == false);
        System.out.println("Joueur " + joueur + " a gagné !!!");
    }
}