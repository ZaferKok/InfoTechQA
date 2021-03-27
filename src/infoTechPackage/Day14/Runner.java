package infoTechPackage.Day14;

public class Runner {


    public static void main(String[] args) {
        Runner myObj = new Runner();
        myObj.canli();
        myObj.cocuk();
        myObj.kedi();
        myObj.kopek();
        myObj.yetiskin();
    }

    public void kedi(){
        Kedi birinciKedi = new Kedi();
        birinciKedi.nefesAl();
        birinciKedi.yavrularım();
        birinciKedi.miyavla();
    }

    public void kopek(){
        Kopek birinciKopek = new Kopek();
        birinciKopek.nefesAl();
        birinciKopek.yavrularım();
        birinciKopek.havla();
    }

    public void cocuk(){
        Cocuk birinciCocuk = new Cocuk();
        birinciCocuk.nefesAl();
        birinciCocuk.yemekYe();
        birinciCocuk.oyunOyna();
        System.out.println(birinciCocuk.yasHesapla(1991));
        System.out.println(birinciCocuk.isOgrenci(1991));
    }
    public void yetiskin(){
        Yetiskin birinciYetiskin = new Yetiskin();
        birinciYetiskin.nefesAl();
        birinciYetiskin.kitapOku();
        birinciYetiskin.yemekYe();
        birinciYetiskin.dogumTarihi = 1983;
        System.out.println(birinciYetiskin.yasHesapla(birinciYetiskin.dogumTarihi));
        System.out.println(birinciYetiskin.isOgrenci(birinciYetiskin.dogumTarihi));
    }
    public void canli(){
        Canli birinciCanli = new Canli();
        birinciCanli.nefesAl();
    }






}
