package infoTechPackage.Day3;

import java.util.Scanner;

public class A1_String {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("bir kelime giriniz: ");
        String s = tara.next();

        if(s.equalsIgnoreCase("Adem")){
            System.out.println("Doğru kişisiniz");
        }
    }
}
