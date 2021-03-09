package infoTechPackage.Day8;

import java.util.Arrays;

public class A3_Array {
    public static void main(String[] args) {
        String arrStr[] = {};
        System.out.println(Arrays.toString(arrStr)); // Sonuc []

        String arrStr1[] = new String[5];
        System.out.println(Arrays.toString(arrStr1)); // null, null, null

        arrStr1[0] = "Ahmet";
        System.out.println(Arrays.toString(arrStr1)); //[Ahmet, null, null]
        arrStr1[1] = "Ahmet";
        System.out.println(Arrays.toString(arrStr1)); // [Ahmet, Ahmet, null]
        arrStr1[0] = "Veli";
        System.out.println(Arrays.toString(arrStr1)); // [Veli, Ahmet, null]
        arrStr1[2] = "Yakup";
        arrStr1[3] = "Ahmet";
        arrStr1[4] = "Ahmet";
        System.out.println(Arrays.toString(arrStr1));
        // Soru: Kaç kişinin ismi Ahmet
        int sayac = 0;
        for (byte i = 0; i<arrStr1.length; i++){
            if (arrStr1[i].equals("Ahmet")){
                sayac++;
            }
        }
        System.out.println("Toplam " + sayac + " kisinin adı Ahmet'tir.");
        Arrays.sort(arrStr1);
        System.out.println(Arrays.toString(arrStr1));
    }
}
