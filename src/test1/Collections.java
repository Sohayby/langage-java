/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Collections {
    public static void main(String[] args) {
//     public class Collections {

    
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 10; i <= 100; i = i + 10) {
            list1.add(i);
        }

//            System.out.println(i+"|");
            ArrayList<Integer> list2 = new ArrayList<>();

            for (int j = 2; j <= 100; j = j + 2) {
                list2.add(j);
            }
           
                ArrayList<Integer> list3 = new ArrayList<>();

                for (int z = 3; z <= 99; z = z + 3) {
                    list3.add(z);
                }
//                    System.out.println( i);
                
      
    list2.removeAll(list1);
    list2.removeAll(list3);
System.out.println(list1);
                 System.out.println( list2);
                System.out.println(list3);
        }
    }


//list1.add(i);
//           list2.add(j);
//           list3.add(z);
//        i.add(Integer.)
//        list.add("A");
//        list.add("B");
//        list.add("B");
//        list.add("C");
////        for (String s: list){
//            System.out.println(list );
//            list.remove("Coucou");
////            System.out.println(list + "" +list.size());
//list.removeAll(list);
//            System.out.println(list.get(2));

