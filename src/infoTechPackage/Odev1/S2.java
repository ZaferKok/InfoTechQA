package infoTechPackage.Odev1;

import java.util.Scanner;

public class S2 {
    // Kullanıcıdan bir cümle alınız ve cümledeki
    // e ve i harfi miktarlarını karşılaştırınız.
    // Hangisinin hangisinden fazla olduğunu yazdırınız.
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("bir cümle giriniz: ");
        String s = tara.nextLine();

        System.out.println("bu program girdiğiniz cümledeki iki harfi kıyaslar");
        System.out.println("hangi harfi bulmak istiyorsunuz? ");
        System.out.println("bulmak istediğiniz ilk harfi giriniz:  ");

        String harf1 = tara.next();
        char harf11 = harf1.charAt(0);
        System.out.println("bulmak istediğiniz ikinci harfi giriniz:  ");
        String harf2 = tara.next();
        char harf22 = harf2.charAt(0);

        int sayac = 0;  //sayac ilk olarak bulmak istediğimiz harfin sayısını verir
        int sayac1 = 0; //sayac1 ise ikincil olarak bulmak istediğimiz harfin sayısını verir

        for (int i1 = 0; i1 < s.length(); i1++) {
            if (s.charAt(i1) == harf11) {

                sayac++;

            } else if (s.charAt(i1) == harf22) {
                sayac1++;
            }
        }
        if (sayac < sayac1) {
            System.out.println(harf11 + " harfinden " + sayac + " " + harf22 + " harfinden " + sayac1 + " adet vardır");
            System.out.println(harf11 + " harfi " + harf22 + " harfinden azdır");
        } else if (sayac > sayac1) {
            System.out.println(harf11 + " harfinden " + sayac + " " + harf22 + " harfinden " + sayac1 + " adet vardır");
            System.out.println(harf11 + " harfi " + harf22 + " harfinden fazladır");
        } else if (sayac == sayac1 && sayac != 0) {
            System.out.println(harf11 + " harfinden " + sayac + " " + harf22 + " harfinden " + sayac1 + " adet vardır");
            System.out.println("harfler eşittir");
        } else if (sayac == 0 && sayac1 == 0) {
            System.out.println("girdigiğiniz harfler bulunmamaktadır");
        }

    }
}
