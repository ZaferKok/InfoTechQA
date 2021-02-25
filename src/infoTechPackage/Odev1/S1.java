package infoTechPackage.Odev1;

import java.util.Scanner;

public class S1 {
 /* Kullanıcıdan yaşını ve cinsiyetini sisteme girmesini talep ediniz.
    Yaşı 65'ten büyük ve cinsiyeti erkek olanlara 'Emeklisiniz'
    Yaşı 60'dan büyük ama cinsiyeti bayan olanlara 'Emeklisiniz'
    Yaşı 18'den küçük olanlara 'Çalışamazsınız'
    Diğerlerine 'İyi çalışmalar'
    cevaplarını veren bir döngü yazınız.*/

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("lutfen yasınızı giriniz");
            Scanner s = new Scanner(System.in);
            int yas = s.nextInt();

            System.out.println("cinsiyetinizi E veya K olarak giriniz");
            char c = s.next().charAt(0);
            //  char c1=c.charAt(0);

            if ((c == 'e' || c == 'E') && yas >= 65) {
                System.out.println("emeklisiniz");
            } else if ((c == 'k' || c == 'K') && yas >= 60) {
                System.out.println("emeklisiniz");
            } else if ((c == 'k' || c == 'K') && (yas < 0 || yas > 130)) {
                System.out.println("Lütfen makul değerler içinde yaşınızı giriniz");
            } else if (yas < 18) {
                System.out.println("Calışamazsınız");
            } else
                System.out.println("iyi calışmalar");
        s.close();
        }
    }
}
