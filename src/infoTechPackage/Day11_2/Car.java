package infoTechPackage.Day11_2;

public class Car {

    int price = 1000;
    int year = 2021;
    String marka = "Araba";
    String model = "Serisi";

    public Car(){
        System.out.println("========Basic Donanım Bilgileri============");
        System.out.println("Aracın Basic Fiyatı: " + this.price);
        System.out.println("Aracın model Yılı: " + this.year);
        System.out.println("Aracın Basic Markası: " + this.marka);
        System.out.println("Aracın Basic Serisi: " + this.model);

    }

    Car(int price){ // Aracın fiyatını değiştirelim.

        this.price=price;

    }

    public Car(int price, int year, String marka, String model){
        // Aracın fiyatını değiştirelim.

        this.price=price;
        this.year=year;
        this.marka=marka;
        this.model=model;

        System.out.println("========Yeni Donanım Bilgileri============");
        System.out.println("Yeni Aracın Basic Fiyatı: " + this.price);
        System.out.println("Yeni Aracın model Yılı: " + this.year);
        System.out.println("Yeni Aracın Markası: " + this.marka);
        System.out.println("Yeni Aracın Serisi: " + this.model);

    }

    @Override
    public String toString() {
        return "Bu benim arabam{" +
                "price=" + price +
                ", year=" + year +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
