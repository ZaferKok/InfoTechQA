package infoTechPackage.Day2;

import java.util.Scanner;

public class A4_IfQuestions {
    public static void main(String[] args) {
// Kullanıcının girdiği rakam kaç basamaklı olduğunu kullanıcıya bildirelim.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        int a = scan.nextInt();
        int aa = a % 1000 / 100;
        int aaa = aa % 2; // even = çift rakam demektir. odd = tek rakam demektir.
//        System.out.println(aaa);

        if (a >= 100 || a <= -100) {
            System.out.println("Rakamınız 3 basamaklı veya 3 basamaklıdan daha büyüktür");
        } else if (a / 10 != 0) {
            System.out.println("Rakamınız 2 basamaklıdır");
        } else System.out.println("Rakamınız tek basamaklıdır");
    }
}
