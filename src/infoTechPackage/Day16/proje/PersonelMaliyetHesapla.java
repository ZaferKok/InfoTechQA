package infoTechPackage.Day16.proje;

public interface PersonelMaliyetHesapla {
    //java 8 ile default yazarak interface icinde concrete method olusturma
    //hakkına sahip olduk
    default int yemekGiderleri(){
        return 3;
    };
    int maasGiderleri();
    int sgkGiderleri();

    static void yeniMethod(){
        //static methodlar alt class.lar tarafından
        //override edilmek zorunda değildir.
        //bu methodu yeni uluşturduk ve alt class.larda hata vermedi.
    }
}
