package infoTechPackage.Day1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {

        String s = " Hesap Makinesi";
        System.out.println(s);

        Scanner scan = new Scanner(System.in); // Sisteme kullanıcıdan veri girişi
        System.out.println("1. rakamı giriniz");
        int a = scan.nextInt();
        System.out.println("2. rakamı giriniz");
        int z = scan.nextInt();
//        double d = scan.nextDouble();
//        String ss = scan.nextLine();

        System.out.println("Toplamları = " + (a + z));
        System.out.println("Çıkarımları = " + (a - z));
        System.out.println("Çarpımları = " + (a * z));
        System.out.println("Bölümleri = " + (a / z));
        System.out.println("" + a * z + 5);
        System.out.println(5 + a * z + "");

        int i = 35;
        int j = 10;
        long l = 625;
        float f = 2.5f;
        double notortalamasi = 2.456;
        char c = '6';
        boolean b = true;

        System.out.println("Zfr");
    }
}
