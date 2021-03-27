package infoTechPackage.Day14;

import java.util.Date;

public class Insan extends Canli{

    public Insan() {
    }

    public Insan(String lastName, int dogumTarihi) {
        this.lastName = lastName;
        this.dogumTarihi = dogumTarihi;
    }

    static String name="yusuf";
    String lastName = "InsanName";
    int dogumTarihi;

    public int yasHesapla(int dogumTarihi){
        return 2021-dogumTarihi;
    }
    public boolean isOgrenci(int dogumTarihi){
        if (2021-dogumTarihi<25){
            return true;
        } else {
            return false;
        }
    }
    public void yemekYe(){
        System.out.println("ben yemek yerim");
    }



}
