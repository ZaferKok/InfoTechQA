package infoTechPackage.Day9;

import java.util.Scanner;

public class A1_AsciiNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir baslangıç harfini giriniz");
        int bas = scan.next().charAt(0);
        System.out.println("lütfen bir bitiş harfini giriniz");
        int bitis = scan.next().charAt(0);


        // Tüm karakterlerin ASCİİ numarası vardır. Bu şekilde hepsi yazdırılabilir. Ezbere bilmeye gerek yok. Nasıl bulabileceğinizi bilmeniz yeterli.
        for (int i = 0; i<255; i++)
        {
            System.out.println((char)i + " => " + i);
        }

        char ilk = 'A';
        char ikinci = 'B';
        char son = 'Z';
        int ascii = ilk; // Büyük A harfinin ASCİİ numarası
        int asciiIkinci = ikinci;
        int asciiSon = son; // Büyük Z harfinin ASCİİ numarası
        System.out.println(ascii);
        System.out.println(asciiIkinci);
        System.out.println(asciiSon);

        int deneme = 75;
        System.out.println((char)deneme); // ilgili sayı CASTING yapılarak temsil ettiği karakter yazdırılabilir.

        //  A 'dan Z 'ye kadar yazdırma
        for (int i = 65; i<=90 ; i++){
            System.out.print ((char)i + " ");
        }

        System.out.println();

        // a' dan z' ye kadar yazdırma
        System.out.println("Küçük alfabe");

        for (int i = 97; i<=122 ; i++){
            System.out.print ((char)i + " ");
        }

        System.out.println();

        // Kullanıcının girdigi baslangıç karakterinden bitis karakterine kadar yazdırma
        for (int i = bas; i<=bitis; i++){
            System.out.print((char)i + " ");
        }
    }
}
