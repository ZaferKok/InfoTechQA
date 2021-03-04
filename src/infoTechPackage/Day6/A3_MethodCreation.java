package infoTechPackage.Day6;

import java.util.Scanner;

public class A3_MethodCreation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hesap işlemi gerçekleştirmek için ilk rakamı giriniz");
        int a = s.nextInt();
        System.out.println("ikinci rakamı giriniz");
        int b = s.nextInt();

        hesapMak(a); // Tek değer atanan method çalışır.
        hesapMak(a,b); // Çift değer atanan method çalışır.

    }

    public static int hesapMak(int ilk, int ikinci) {

        Scanner s = new Scanner(System.in);
        System.out.println("yapmakı istediğiniz işlemlerden birini seçiniz: *   /   -   +  ");
        char islem = s.next().charAt(0);

        int sonuc = 0;
        switch (islem) {
            case '*':
                sonuc = ilk*ikinci;
                System.out.println("Çarpma işleminin sonucu: " + sonuc);
                break;
            case '/':
                System.out.println("Bölme işleminin sonucu: " + (ilk / ikinci));
                break;
            case '-':
                System.out.println("Çıkarma işleminin sonucu: " + (ilk - ikinci));
                break;
            case '+':
                System.out.println("Toplama işleminin sonucu: " + (ilk + ikinci));
                break;
            default:
                System.out.println("Lütfen geçerli bir matematik işlemi giriniz");
        }
        return sonuc;
    }

    public static int hesapMak(int ilk) {

        Scanner s = new Scanner(System.in);
        System.out.println("yapmakı istediğiniz işlemlerden birini seçiniz: *   /   -   +  ");
        char islem = s.next().charAt(0);
        int ikinci = 5;
        int sonuc = 0;
        switch (islem) {
            case '*':
                sonuc = ilk*ikinci;
                System.out.println("Çarpma işleminin sonucu: " + sonuc);
                break;
            case '/':
                System.out.println("Bölme işleminin sonucu: " + (ilk / ikinci));
                break;
            case '-':
                System.out.println("Çıkarma işleminin sonucu: " + (ilk - ikinci));
                break;
            case '+':
                System.out.println("Toplama işleminin sonucu: " + (ilk + ikinci));
                break;
            default:
                System.out.println("Lütfen geçerli bir matematik işlemi giriniz");
        }
        return sonuc;
    }
}
