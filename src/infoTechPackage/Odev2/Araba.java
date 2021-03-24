package infoTechPackage.Odev2;

public class Araba {
    //    araba: model,yıl,guncelFiyat
    String model;
    int yil;
    int guncelFiyat;

    public Araba() {
    }

    public Araba(String model, int yil, int guncelFiyat) {
        this.model = model;
        this.yil = yil;
        this.guncelFiyat = guncelFiyat;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", yil=" + yil +
                ", guncelFiyat=" + guncelFiyat +
                '}';
    }
}
