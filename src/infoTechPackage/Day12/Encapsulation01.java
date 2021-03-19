package infoTechPackage.Day12;

import infoTechPackage.Day11_2.Car;

public class Encapsulation01 {

    //encapsulation bir data hiding(saklama) yontemidir.
    //bir class.ta olusturdugumuz variableları(degıskenleri)
    //degıstirme-ulasabilme ozelligi eklememize yardımcı olur.



    public static void main(String[] args) {
        //adam clası tipinde bir adam olusturdum.
        Adam benimIlkAdamim = new Adam();

        Car myNewCar = new Car(1500,2005,"bmw","520i");
        Car myNewCar2 = new Car(1600,2015,"bmw","320i");

        System.out.println(benimIlkAdamim.getFirstName());
        System.out.println(benimIlkAdamim.getVarlik());
        System.out.println(benimIlkAdamim.getKimlikNo());

        benimIlkAdamim.setFirstName("yusuf");
        benimIlkAdamim.addNewVarlik(myNewCar2);
        benimIlkAdamim.addNewVarlik(myNewCar);
        benimIlkAdamim.addNewVarlik("bunu da ekle");

        System.out.println(benimIlkAdamim.getVarlik().toString());
    }

}
