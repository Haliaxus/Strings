package Stringi;

import java.util.Scanner;

public class suma_cyfr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Program zliczy wszystkie cyfry w podanym przez Ciebie tekscie.");
        System.out.print("Podaj tekst: ");
        String word = s.nextLine();
        int suma = 0;
        for(int i =0;i<word.length();i++) {
            if (word.charAt(i)>=48 && word.charAt(i)<=58)
            {
                suma+=word.charAt(i)%48;
            }
        }
        System.out.println(suma);
    }
}