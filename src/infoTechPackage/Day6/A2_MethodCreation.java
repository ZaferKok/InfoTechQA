package infoTechPackage.Day6;

import java.util.Scanner;

public class A2_MethodCreation {

    public static void main(String[] args) {


       hesapMak();


    }



    public static int hesapMak() {

        Scanner s = new Scanner(System.in);
        System.out.println("Hesap işlemi gerçekleştirmek için ilk rakamı giriniz");
        int ilk = s.nextInt();
        System.out.println("ikinci rakamı giriniz");
        int ikinci = s.nextInt();
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

}
