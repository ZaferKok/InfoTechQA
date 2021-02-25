package infoTechPackage.Day2;

import java.util.Scanner;

public class A7_Char {
    public static void main(String[] args) {
        // 'Hava soguk' yazınız
        //  0123456789
        // Cümle içerisindeki a harf miktarını bulunuz.

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        int l = s.length();
        System.out.println(l);

        int sayac = 0;

        System.out.println(sayac);

        for (int i = 0;     i<s.length();       i++){
            System.out.println(s.charAt(i));

            if (s.charAt(i) == 'a'){
                sayac++;
            }
        }
        System.out.println("Girmiş olduğunuz cümlede " + sayac + " tane a harfi bulunmaktadır");
    }
}
