package ru.sbt.jschool.session4;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(Problem1.class.getResourceAsStream("/problem1.txt"));
        Scanner sc1 = new Scanner(Problem1.class.getResourceAsStream("/rosalind_dna_1_dataset.txt"));


        new Problem2().DNA(sc1.nextLine());

    }
    private void DNA(String str) {
//        String s = str.replace("T", "U");
//        System.out.println(s);
        String s =  str.chars().map(x ->x=='T'?(int)'U':x).mapToObj(x -> (char)x+"").collect(Collectors.joining());
        System.out.println(s);
    }

}
