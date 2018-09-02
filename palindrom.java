package Stringi;

import java.util.Scanner;

public class palindrom  {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Podaj wyraz: ");
        String word = s.next();
        StringBuilder odwrocony = new StringBuilder(word);
        String word2 = odwrocony.reverse().toString();
        if(word.equals(word2)) System.out.println("Slowo jest palindromem");
        else
            System.out.println("To nie jest palindrom");
    }
}
