package com.valiksk8;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainClass {

    public static void main(String[] args) {
        int result = numJewelsInStones("aA", "aAAbB");
        System.out.println(result);
    }

    public static int numJewelsInStones(String J, String S) {
        char[] jArray = J.toCharArray();
        char[] sArray = S.toCharArray();
        int c = 0;
        for (int i = 0; i < S.length(); i++) {
            char current = sArray[i];
            for (int j = 0; j < J.length(); j++) {
                if(current == jArray[j]){
                    c++;
                    break;
                }
            }
        }
        return c;

//        sList = S.chars().filter(c -> jList.contains(c))
//        char[] b = J.toCharArray();
//        int i = 0;
//
////         S.chars().forEach(c -> System.out.println(c));
//         S.chars().skip((c -> jSet.contains(((Object) c)));
//         i += S.chars().anyMatch(c -> findByCriteria(c == b, b, c));
    }


    public int sum(int a, int b) {
        return a + b;
    }
}


