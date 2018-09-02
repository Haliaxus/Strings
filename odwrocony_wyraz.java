package Stringi;

import java.util.Scanner;

public class odwrocony_wyraz {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Podaj slowo, program wypisze je w odwrotnej kolejnosci: ");
        String word = s.next();
        StringBuilder odwrot = new StringBuilder(word);
        odwrot.reverse().toString();
        System.out.println(odwrot);
    }
}
