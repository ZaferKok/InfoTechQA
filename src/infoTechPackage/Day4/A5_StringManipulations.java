package infoTechPackage.Day4;

import java.util.Scanner;

public class A5_StringManipulations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir kelime girin lütfen!");
        String str = s.nextLine();


        String str2 = str.toUpperCase();
        System.out.println(str2);
        String str3 = str.toLowerCase();
        System.out.println(str3);


        String str1 = "     Burak'in Arabasi Volvo    "; // Başındaki ve sonundaki boşlukları keser ve orta kısmı yazdırır.
        System.out.println(str1);
        String str4 = str1.trim();
        System.out.println(str4);


    }
}
