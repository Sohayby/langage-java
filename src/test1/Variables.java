/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author tom
 */
public class Variables {

    public static void main(String[] args) {

        Integer i = new Integer(123);
        String s = i.toString();
        Long l = Long.valueOf(s);
        l = l + 100;
        
        s=l.toString();
        
        System.out.println("Résultat: " + s);
    }
}
