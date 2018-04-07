package ru.sbt.jschool.session4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Problem1.class.getResourceAsStream("/codTable.txt"));
        Scanner sc1 = new Scanner(Problem1.class.getResourceAsStream("/rosalind_prot.txt"));
        new Problem6().prot(sc.nextLine(), sc1.nextLine() );
    }
    private void prot(String str, String str1) {
        Map<String,String> map = new HashMap<>();
        String[] s = str.split("\\s+");
        for(int i =0; i< s.length; i+=2){
            map.put(s[i], s[i+1]);

        }
        String res = "";
        for(int i = 0; i< str1.length(); i+=3){
            if (map.get(str1.substring(i, i+3)).equals("Stop")){
                break;
            }
            res+=map.get(str1.substring(i, i+3));
        }
        System.out.println(res);
    }
}
