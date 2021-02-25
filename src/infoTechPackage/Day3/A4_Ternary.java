package infoTechPackage.Day3;

import java.util.Scanner;

public class A4_Ternary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir rakam giriniz");
        int r = s.nextInt();

//      String sonuc = r > 0 ? "Rakam Pozitif" : "Rakam Negatif";
//      System.out.println(sonuc);

        String sonuc2 = r >= 0 ? (r < 100 ? "Rakam Pozitif ve 0 ile 100 arasında" : "Rakam 0 ile 100 arasında değil") :
                                 (r >-100 ? "Rakam Negatif ve 0 ile -100 arasında" : "Rakam Negatif ama -100 den daha küçük");
        System.out.println(sonuc2);

        char sonuc3 = r >= 0 ?   (r < 100 ? 'P' : 'N') :
                                 (r >-100 ? 'P' : 'N');
        System.out.println(sonuc3);

//        a ? b : c;
//        a ? (a ? d : e) : (a ? f : g);

    }
}
