package infoTechPackage.Odev1;

import java.util.Arrays;
import java.util.Scanner;

public class S3 {

/*    SORU: ---INT ARRAY DİZİSİNE KULLANICIDAN FOR DÖNGÜSÜ İLE VERİ ALARAK 5 TANE RAKAM ATAYIN.
            ---RAKAMLARIN ORTALAMASINI BULUN VE YAZDIRIN
            ---EN KÜÇÜK VE EN BÜYÜK RAKAMLARI BULUN VE YAZDIRIN
            ---ORTALAMADAN BÜYÜK OLAN RAKAMLARI BULUN YAZDIRIN.
            ---ORTALAMADAN KÜÇÜK RAKAMLARIN ORTALAMASINI BULUN VE YAZDIRIN. */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dizin uzunlugunu giriniz");
        System.out.println("Lütfen 5 tane elemet içeren dizinin verilerini sırayla giriniz");

        int[] arr = new int[scan.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ". elementi giriniz!");
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Dizinin en küçük elemanı: " + arr[0]);
        System.out.println("Dizinin en büyük elemanı: " + arr[arr.length - 1]);

        float toplam = 0f;
        for (int i = 0; i < arr.length; i++) {
            toplam = toplam + arr[i];
        }
        System.out.println("Dizinin ortalaması: " + toplam / arr.length);

        float kucukToplam = 0f;
        int sayac = 0;
        System.out.print("Ortalamadan büyük elemanlar : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>(toplam/arr.length)){
                System.out.print(arr[i]+", ");
            }else if (arr[i]<(toplam/arr.length)){
                kucukToplam = kucukToplam + arr[i];
                sayac++;
            }
        }
        System.out.println();
        System.out.println("Dizinin ortalamasından küçük olan elemanların ortalaması : " + kucukToplam/sayac);

    }
}
