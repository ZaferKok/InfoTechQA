package infoTechPackage.Day9;

import java.util.Scanner;

public class A4_DoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 1'den 10'a kadar bir rakam giriniz!");
        int r = 1;
        int sayac = 0;
        do {
            r = scan.nextInt();
            if (sayac < 2 && r!=5) {
                System.out.println("Olmadı!. Tekrar dene!");
            }
            sayac++;
            if (sayac == 3 && r!=5 ) {
                System.out.println("Hakkınız bitti. Game Over");
                break;
            }
        } while (r != 5);
        if (r == 5) {
            System.out.println("Tebrikler. Kazandınız");
        }
    }
}
