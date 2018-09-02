package Stringi;

import java.util.Scanner;

public class ostatnia_litera {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Podaj slowo, program zliczy wystapienia ostatniej litery: ");
        String word = s.next();
        int wskaznik = 0;
        char ostatnia = word.charAt(word.length()-1);
        for (int i=0; i<word.length(); i++)
        {
            if(ostatnia==word.charAt(i)) wskaznik++;
        }
        System.out.println(wskaznik);
    }
}
