package ru.sbt.jschool.session4;

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(Problem1.class.getResourceAsStream("/rosalind_subs.txt"));


        new Problem5().subs(sc.nextLine(), sc.nextLine() );
    }

    private void subs(String str, String str1) {
        int n=0;
        int k = 0;


        for(int i = 0; i < str.length(); i=+n+1){
            n = str.indexOf(str1)+1;
            k +=n;
            str = str.substring(n+1);
            System.out.print(k + " ");
            k++;
        }
    }
}
