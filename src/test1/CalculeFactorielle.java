/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import test1.util.MathUtil;

/**
 *
 * @author tom
 */
public class CalculeFactorielle {
    
    public static void main(String[] args) {
        
        int n = 3;
        int res = MathUtil.factorielle(n);
        
        System.out.println("Factorielle de " + n + " vaut: " + res);
        System.out.format("Factorielle de %d vaut: %d\n", n, res);
    }
}
