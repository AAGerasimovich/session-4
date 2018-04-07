package ru.sbt.jschool.session4;

import java.util.Scanner;
import java.util.stream.Stream;

public class Problem4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(Problem1.class.getResourceAsStream("/rosalind_hamm.txt"));

        new Problem4().hamm(sc.nextLine(), sc.nextLine() );
    }


    private void hamm(String str, String str1) {
        int count = 0;
        for(int i =0; i< str.length(); ++i){
            if(str.charAt(i)!=str1.charAt(i)){
                count++;
            }
        }

        System.out.println(count);
    }
}
