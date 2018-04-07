package ru.sbt.jschool.session4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Problem1.class.getResourceAsStream("/MonoisotopicMassTable.txt"));
        Scanner sc1 = new Scanner(Problem1.class.getResourceAsStream("/rosalind_prtm.txt"));
        new Problem7().prtm(sc.nextLine(), sc1.nextLine() );
    }
    private void prtm(String str, String str1) {
        Map<String,Double> map = new HashMap<>();
        String[] s = str.split("\\s+");
        for(int i =0; i< s.length; i+=2){
            map.put(s[i], Double.parseDouble(s[i+1]));

        }
        Double sum = 0.0;
        for(int i = 0; i< str1.length(); i++){

            sum+=map.get(str1.substring(i, i+1));
        }
        System.out.println(sum);
    }
}
