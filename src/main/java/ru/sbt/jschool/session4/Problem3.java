package ru.sbt.jschool.session4;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Problem1.class.getResourceAsStream("/rosalind_revc.txt"));


        new Problem3().revc(sc.nextLine());
    }

    private void revc(String str) {

        int stringLength = str.length();
        String result = "";
        for (int i = stringLength-1; i >= 0; --i) {
            if (str.charAt(i) == 'A'){
                result+= "T";
            }
            if (str.charAt(i) == 'C'){
                result+=  "G";
            }
            if (str.charAt(i) == 'G'){
                result+= "C";
            }
            if (str.charAt(i) == 'T'){
                result+= "A";
            }
        }
        System.out.println(result);
    }
}
