package infoTechPackage.Day10;

import java.util.Arrays;

public class ArraySoruCozumu {

//    Given an array of ints length 3, figure out which is larger, the first or last element in the array,
//    and set all the other elements to be that value. Return the changed array.

    public static void main(String[] args) {

        int [] myArray = new int [3];
        int []myArray2 = {7,2,8};
        int [] myArray3 = new int [] {1,2,3};
//        System.out.println(Arrays.toString(maxEnd3(myArray2)));
//        cozum();
//        System.out.println(Arrays.toString(maxEnd3v2(myArray3)));

        System.out.println(Arrays.toString(maxEnd3v2(maxEnd3(myArray2))));
    }

    public static int[] maxEnd3(int[] nums) {
        if(nums[0]<nums[2]){
//            int mahmut[]={nums[2],nums[2],nums[2]};
//            return mahmut;
            return new int[] {nums[2],nums[2],nums[2]};
            //return sadece icerik ile ilgilenir, return tipinin ismi
            //bir anlam ifade etmez. bu yüzden isim vermeden sadece return
            // "keyword"u ile islem yapabiliriz.
        }
        else {
            int b[]={nums[0],nums[0],nums[0]};
            return b;
        }
    }

    public static void cozum(){
        //bizden istenen return tipinde return yapmaz isek
        //yaptığımız islem dogru olsa bile veriyi isleyemeyiz.
        int dizi[] = {1,2,3};
        if(dizi[0] > dizi[2]){
            for(int i=0; i < 3; i++){
                dizi[i] = dizi[0];
            }
        }
        else{
            for(int i=0; i < 3; i++){
                dizi[i] = dizi[2];
            }
        }
        for(int i=0; i < 3; i++){
            System.out.print(dizi[i]);
        }
        System.out.println();
    }
    public static int[] maxEnd3v2(int[] nums) {
        if(nums[0]<nums[2]){
            int srr[]={nums[2],nums[2],nums[2]};
            return  srr;
        } else
            return  new int []{nums[0],nums[0],nums[0]};
    }
}
