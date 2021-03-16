package infoTechPackage.Day11_2;

import java.util.Scanner;

public class Catalog {

    public static void main(String[] args) {

        //  Class name       Object name      new keyword             Constructor
        A_Constructor01        obj1      =         new               A_Constructor01();

        Car tofas = new Car();
        System.out.println(tofas.year);

        Car tofas2 = new Car(2000);
        System.out.println("Yeni tanımlanan aracın fiyatı : " + tofas2.price);

        Car bmw = new Car(30000,2021,"BMW","3 Serisi");
        Car audi = new Car(40000,2021,"AUDI","4 Serisi");
        audi.price = 50000;
        System.out.println("Yeni fiyat : " + audi.price);

    }
}
