/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

import static java.lang.Integer.max;

/**
 *
 * @author tom
 */
public class MathUtil1 {

    public static int factorielleRecursive(int nombre){
        
        if( nombre<0 ){
            throw new RuntimeException("Erreur mathématique!");
        }
        
        if( nombre<=1 ){
            return 1;
        }
        
        // nombre > 1
        
        return nombre * factorielleRecursive(nombre-1);
        
    }
    
    public static int factorielle(int nombre){
        
        if( nombre<0 ){
            throw new RuntimeException("Erreur mathématique!");
        }
        
        int res=nombre;
        while( nombre>1 ){
            
            res = res * (nombre-1);
            
            nombre--;
        }
        
        return res;
    }
    
    public static int exposant(int nombre, int puissance){
        
        if( puissance<=0 )
            return 1;
        
        // Puissance > 0
        int resultat = nombre;
        while( puissance>1 ){
         
            resultat = resultat * nombre;
            puissance --;
        }
        
        return resultat;
    }
    
    public static int genererNbrAleat(int Min, int Max){
        if (Min>=Max)
            throw new RuntimeException("Erreur: Min>=Max");
        
        int res= (int) (Math.random()*(Max-Min));
        return res;
        
//         public static int genererNbrAleatRECURSIVE(int Min, int Max){
//               if (Min<Max) {
//     
//                   throw new RuntimeException("Erreur: Min>=Max");
//        }
//             int nbAleat=(int) (Math.random() * Max);
//             return nbAleat;
//            return genererNbrAleatRECURSIVE (Min,Max);
            
             
             
         }
       public static int genererNbrAleat1(int Min, int Max) {
        if (Min >= Max) {
            throw new RuntimeException("Erreur: Min>=Max");
        }
        int nbGenere;
        do {
            nbGenere = (int) (Math.random() * Max);
        } while (nbGenere < Min);
        return nbGenere;
       }
    public static int carre(int nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int genererNbrAleat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
              
        }
//        public static int genererNbrAleat()
//        {
//        double nombreSecretDecimal = Math.random() * 100 + 1;
//        int nombreSecret = (int) nombreSecretDecimal;
//        
//        return nombreSecret;
//    }
    
//    public static int carre(int n) {
//        int c = n * n;
//        return c;
//    }

