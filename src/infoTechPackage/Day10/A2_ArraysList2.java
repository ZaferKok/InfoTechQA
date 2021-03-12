package infoTechPackage.Day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class A2_ArraysList2 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        //listerin icinde hicbir zaman primitive data type kullanılmaz.
        boolean dogruMu =  false;
        Boolean yanlisMi = true;
        double sayi = 2.5;
        Double sayi2 = 3.5;
        Character harf = 'd';
        char harf2 = 'd';
        ArrayList<Character>myListV2 = new ArrayList();
        myList.add("birinci");
        myList.add("ikinci");
        myList.add("ucuncu");
        myList.add("dorduncu");
        System.out.println(myList);
        // list.lerde degisiklik icin index.e ihtiyacımız var.
        // daha dinamik(icindeki butun "sorgu" lari) degistir demek istersek for dongusu kullanmamız gerekecek.
        myList.set(0,"xxx");
        System.out.println(myList);
        //listin icindeki tum "xxx"verilerini "yyy" olarak degistirin.
        for(int i=0;i<myList.size();i++){
            //myList.get() methodu arraylerdeki gibi istedigimiz index.teki veriyi GETIRMEK icin kullanılır.
            if(myList.get(i).equals("xxx")){
                //set moethudu sayesinde index.i dondurerek verileri degistirdik.
                myList.set(i,"yyy");
            }
        }
        //myArray[1] = 6; => myList.set(1,"ali");
        //myArray[0]; => myList.get(0);
//        myList.get(0);
//        myList.get(1);
//        myList.get(2);
        System.out.println(myList);
        //clear methodu ile liste icindeki butun verileri silebiliriz.
        //myList.clear();
        //System.out.println(myList);
        System.out.println(myList.contains("ali"));//true yada false dondurecek
        //collections.tan gelen sort methodu liste icini alfabetik(natural order) sıraya dizer.
        Collections.sort(myList);
        System.out.println(myList);
    }
}
