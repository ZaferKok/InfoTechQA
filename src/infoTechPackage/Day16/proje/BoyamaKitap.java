package infoTechPackage.Day16.proje;

public abstract class BoyamaKitap extends Kitap implements PersonelMaliyetHesapla,MaaliyetHesapla{

    //boya kitabı abstract class oldugu icin implement ettigi int.ler icindeki
    //butun abstract methodları override etmek zorunda değil.
    //bu bize esneklik kazandırdı fakat obje uretme yeteneginizi kaybettik.

    @Override
    public int isciGiderleri() {
        return 0;
    }

//    @Override
//    public int vergiGiderleri() {
//        return 0;
//    }
//
//    @Override
//    public int kiraGiderleri() {
//        return 0;
//    }

    @Override
    public int yemekGiderleri() {
        return 0;
    }

    @Override
    public int maasGiderleri() {
        return 0;
    }

    @Override
    public int sgkGiderleri() {
        return 0;
    }
}
