package infoTechPackage.Day4;

import java.sql.SQLOutput;

public class A1_StringManipulations {
    public static void main(String[] args) {

        String str = "Banana, apple";
        //            0123456789012
        int indx1 = str.indexOf(" ");
        int indx2 = str.indexOf("B");
        int indx3 = str.indexOf(",");
        int indx4 = str.indexOf("a");
        int indx5 = str.indexOf("e");
        int indx6 = str.indexOf("l");
        int indx7 = str.indexOf("a",7);

        System.out.println(indx7);
//        for (int i = 1 ; i<=6 ; i++){
//            String a = "indx"+i;
//            System.out.println(a);
//        }
    }
}
