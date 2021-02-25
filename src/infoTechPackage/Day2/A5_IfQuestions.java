package infoTechPackage.Day2;

import java.util.Scanner;

public class A5_IfQuestions {
    public static void main(String[] args) {
        // Girilen iki rakamın artan sıra ile olup olmadığını kontrol ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki rakam giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a<b){
            System.out.println("Rakamlar artan sıra ile girilmiştir");
        }else
            System.out.println("Rakamlar azalan sıra ile girilmiştir");
    }
}
