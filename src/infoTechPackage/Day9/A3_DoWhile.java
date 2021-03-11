package infoTechPackage.Day9;

import java.util.Scanner;

public class A3_DoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir rakam giriniz!");
        int r = scan.nextInt();

        // Girilen değer 5'den küçük olduğu taktirde döngü hiç çalışmaz.
        while (r > 5) {
            System.out.println("While döngüsü");
        }


        // Girilen değer 5'den küçük olsa bile en az bir kere çalışır.
        do {
            System.out.println("Do While döngüsü");
        } while (r > 5);


    }
}
