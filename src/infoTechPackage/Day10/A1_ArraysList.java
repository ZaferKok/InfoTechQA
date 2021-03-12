package infoTechPackage.Day10;

import java.util.ArrayList;
import java.util.Arrays;

public class A1_ArraysList {

    public static void main(String[] args) {
        int [] myArray = new int [3];
        int []myArray2 = {7,2,8};
        int [] myArray3 = new int [] {1,2,3};



        //arrayde boyle idi.
        System.out.println(Arrays.toString(myArray2));
        System.out.println("benim arrayimin uzunluğu: "+myArray2.length);
        //ArrayList => length'i esnek olan bir arraydir.
        //listlerde ise islem daha kolay
        ArrayList<String> myFirstArrayList = new ArrayList<>();
        //bir veri ekledik
        myFirstArrayList.add("istanbul");
        myFirstArrayList.add("izmir");
        myFirstArrayList.add("ankara");
        myFirstArrayList.add("izmir");
        System.out.println("bu benim ilk listem "+myFirstArrayList);//bu benim ilk listem [istanbul, izmir, ankara, izmir]
        //istedigimiz index.e veri ekleyebiliriz.
        myFirstArrayList.add(1,"birinci index.e bunu koy");
        System.out.println(myFirstArrayList);//[istanbul, birinci index.e bunu koy, izmir, ankara, izmir]
        //arrayimizin uzunlugunu size ile ogreniriz.
        System.out.println(myFirstArrayList.size());//5
        //remove metodunun icinde yazdığınız object.i ilk gordugu yerdekı veriyi siler
        //siz bunu syso icinde yazdırırsanız size boolean dondurur.
        System.out.println(myFirstArrayList.remove("izmir"));//true
        System.out.println(myFirstArrayList);//[istanbul, birinci index.e bunu koy, ankara, izmir]
        myFirstArrayList.remove(1);
        //eger remove methodunu kullanıp bunu syso icinde kullanırsanız size silinen elemanı yazdırır.
        System.out.println(myFirstArrayList.remove(1));//ankara
        System.out.println(myFirstArrayList);//[istanbul, izmir]


    }
}





