package infoTechPackage.Day3;

import java.util.Scanner;

public class A2_Switch {
    // Haftanın günlerinden birinin baş harfini giriniz ve kullanıcıya hangi gün olduğunu söyleyiniz.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Haftanın günlerinden birinin baş harfini giriniz");
        char gununBasHarfi = s.next().charAt(0);

        switch (gununBasHarfi) {

            case 'P':
                System.out.println("Günlerden Pazar veya Pazartesi veya Perşembe");
                break;
            case 'S':
                System.out.println("Günlerden Salı");
                break;
            case 'C':
                System.out.println("Günlerden Cuma veya Cumartesi veya Çarşamba");
                break;
            default:
                System.out.println("Lütfen geçerli bir günün baş giriniz");
        }
    }
}
