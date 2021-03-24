package infoTechPackage.Day13;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        //for each loop..
        //bir integer toplayan liste yapın ve
        // liste icindeki verileri toplayan method yazın
        int sum=0;
        int sum2=0;
        int[] a={1,2,3,4,5,6,7};
        for (int i=0;i<a.length;i++) {
            sum=sum+a[i];
        }
        System.out.println(sum);
        for(int w :a ){
            sum2=w+sum2;
        }
        System.out.println(sum2);
        List<String> myList = new ArrayList<>();
        myList.add("samet");
        myList.add("hamza");
        myList.add("mert");
        myList.add("burak");
        myList.add("musa");

        for(String eleman : myList){
            System.out.println("xxx "+ eleman + " yyy");
        }

        System.out.println(myList);


    }

}
