package infoTechPackage.Odev1;

import java.util.ArrayList;

public class IndexNum {
    public static void main(String[] args) {

        int a [] = new int[3];
        a[0] = 9;
        a[1] = 99;
        a[2] = 999;

        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(8);
        list1.add(88);
        list1.add(888);

        int b = list1.indexOf(88);
        System.out.println(b);

    }
}
