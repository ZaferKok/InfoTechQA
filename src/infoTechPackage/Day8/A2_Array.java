package infoTechPackage.Day8;

import java.util.Arrays;

public class A2_Array {
    public static void main(String[] args) {

        int arrByte[] = {24, 35, 65, 21, 78, 12, 101};
        Arrays.sort(arrByte); // [12, 21, 24, 35, 65, 78, 101] Bu şekilde arrayin en büyük ve en küçük rakamlarının bulabilirsiniz.
        System.out.println(Arrays.toString(arrByte));

        int arrReverse[] = new int[7]; // Tersten sort etmek için boş bir array  oluşturmak gerekir.

        for(int i  = 0; i< arrReverse.length; i++){
            arrReverse[i] = arrByte[arrByte.length-(i+1)]; // atama yapılacak array baştan başlarken, bilgi alınacak array tersten başlar
        }
        System.out.println("Array'in tersten sort edilmiş hali : " + Arrays.toString(arrReverse));

//***************************************************************************************************************
        // Soru: Array içindeki rakamları while döngüsü ile toplayın.
        int toplam = 0;
        int a = 0;
        while (a < arrByte.length) {
            toplam = toplam + arrByte[a];
            a++;
        }
        System.out.println(toplam);

        // Soru: 0'dan 1000'e kadar olan rakamlardan çift ve tek olanları ayrı arraylere ekleyin.

        int arrCiftSayılar1000eKadar[] = new int[500];
        int arrTekSayılar1000eKadar[] = new int[500];
        int index = 0;
        int index2 = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                arrCiftSayılar1000eKadar[index] = i;
                index++;
            } else {
                arrTekSayılar1000eKadar[index2] = i;
                index2++;
            }
        }
        System.out.println("************************");
        System.out.println(Arrays.toString(arrCiftSayılar1000eKadar));
        System.out.println(Arrays.toString(arrTekSayılar1000eKadar));
        System.out.println("************************");
    }
}
