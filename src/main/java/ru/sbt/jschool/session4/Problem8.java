package ru.sbt.jschool.session4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Problem1.class.getResourceAsStream("/MonoisotopicMassTable.txt"));
        Scanner sc1 = new Scanner(Problem1.class.getResourceAsStream("/rosalind_prtm.txt"));
        new Problem8().lexf("C A G T", "2");
    }

    private void lexf(String str, String str1) {

        String[] s = str.split(" ");

        int len = Integer.parseInt(str1);
        int cnt = (int)Math.pow(s.length, len);
        String[] res = new String[cnt];


        for (int i = 0; i < cnt; ) {
            for (int j = 0; j < s.length; ++j, ++i) {
                res[i] = s[j];

            }
        }
        Arrays.sort(res);
        for (int i = 0; i<len-1; ++i){
            for (int j = 0; j < cnt; ){
                for (int k=0; k < s.length; ++k, ++j){
                    res[j] += s[k];
                }
            }
            Arrays.sort(res);
        }

        Arrays.stream(res).forEach(System.out::println);

    }
}
