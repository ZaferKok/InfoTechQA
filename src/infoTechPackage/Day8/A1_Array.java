package infoTechPackage.Day8;

import java.util.Arrays;

public class A1_Array {
    public static void main(String[] args) {

        int a = 5;
        // İki türlü Array oluşturulabilir
        int arr[] = new int[7]; // 1. yöntem

        int arrOdd[] = {1, 3, 5, 7, 9}; // 2. yöntem
        int arrEven[] = {2, 4, 6, 8, 10};

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 1;
        // Array son durum : int arr[] = {1, 1, 1, 1, 1};
        System.out.println(arr); // Bu şekilde içindeki bilgiyi yazdıramazsınız
        System.out.println(Arrays.toString(arr)); // Bu şekilde içindeki bilgi yazdırılır
        System.out.println(Arrays.toString(arrOdd));

        arr[5] = 111; // Eklenebilir

        //arrOdd[5] = 222; // Eklenemez

        System.out.println(Arrays.toString(arr)); // ArrayIndexOutOfBoundsException
        //  System.out.println(Arrays.toString(arrOdd)); // ArrayIndexOutOfBoundsException
        System.out.println(arr.length);
        arr[0] = 555; // İçindeki data bu şekilde değiştirebilir.
        System.out.println(Arrays.toString(arr));

        int arr1000[] = new int[1000];
        System.out.println(Arrays.toString(arr1000));
        for (int i = 0; i < 1000; i++) {
            arr1000[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr1000));


        int arrToplam = 0;
        for (int i = 0; i < arrEven.length; i++) {
            arrToplam = arrToplam + arrEven[i];
        }
        System.out.println(arrToplam);
    }
}
