package infoTechPackage.Day16.proje;

public class DersKitap extends Kitap implements MaaliyetHesapla,PersonelMaliyetHesapla{

    private final Kitap birinciKitap = new DersKitap();
    private void kitap1(){
        birinciKitap.bookName="ali";
        birinciKitap.isbn=123654;
        birinciKitap.writer="yusuf";
    }
    public void test(){
        //statik olarak zorunlu override etmediğimiz methodu
        //interface ismi uzerinden casirdik.
        PersonelMaliyetHesapla.yeniMethod();
    }
    @Override
    public int isciGiderleri() {
        return yemekGiderleri()+maasGiderleri()+sgkGiderleri();
    }
    @Override
    public int vergiGiderleri() {
        return 3;
    }
    @Override
    public int kiraGiderleri() {
        return 0;
    }
    public int tumMaliyetler(){
        return isciGiderleri()+vergiGiderleri()+kiraGiderleri();
    }
    @Override
    public int yemekGiderleri() {
        return 0;
    }
    @Override
    public int maasGiderleri() {
        return 6;
    }
    @Override
    public int sgkGiderleri() {
        return 0;
    }
}
