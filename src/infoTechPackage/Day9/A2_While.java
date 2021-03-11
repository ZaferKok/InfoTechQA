package infoTechPackage.Day9;

import java.util.Scanner;

public class A2_While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir rakam giriniz!");
        int r = scan.nextInt();

        // Faktoryel hesaplama
        int faktoryel = 1;
        while (r>0){
            faktoryel = faktoryel * r;
            r--;
        }
        System.out.println(faktoryel);

    }
}
