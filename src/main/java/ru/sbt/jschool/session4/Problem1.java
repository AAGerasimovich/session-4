package ru.sbt.jschool.session4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author NIzhikov
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Problem1.class.getResourceAsStream("/problem1.txt"));
        Scanner sc1 = new Scanner(Problem1.class.getResourceAsStream("/rosalind_dna.txt"));
     new Problem1().countDNA(sc1.nextLine());
    }

    private void countDNA(String str) {

//        int[] count = {0,0,0,0};
//
//       for(int i = 0; i < str.length(); ++i){
//           char c = str.charAt(i);
//           if (c == 'A'){
//               count[0]++;
//           }
//           if (c == 'C'){
//               count[1]++;
//           }
//           if (c == 'G'){
//               count[2]++;
//           }
//           if (c == 'T'){
//               count[3]++;
//           }
//       }
        Map<Integer,Integer> map = new HashMap<>();

        str.chars().forEach(x -> {
            if (map.get(x)!=null)
            map.put(x, map.get(x)+1);
            else map.put(x, 1);
        });
        System.out.println(map.get((int)'A') + " " + map.get((int)'C') + " " + map.get((int)'G')+ " " + map.get((int)'T'));
    }

}
