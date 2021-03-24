package infoTechPackage.Odev2;

import java.util.ArrayList;
import java.util.List;

public class AllPersonService {

    static AllPersonService obj = new AllPersonService();
    List<Person> myPersonList = new ArrayList<>();
    public static void main(String[] args) {
        //System.out.println(obj.myAllPersons());
        obj.myAllPersons();
        for(Person w : obj.myPersonList){
            System.out.println(w.name);
        }
    }

    public List<Person> myAllPersons(){
        myPersonList.add(person1());
        myPersonList.add(person2());
        myPersonList.add(person3());
        return myPersonList;
    }

    public Person person1(){
        Cocuk birinciCocuk = new Cocuk("mehmet","yildiz",15,false);
        Araba birinciAraba = new Araba("BMW",2005,1000);
        Araba ikinciAraba = new Araba("Mercedes",2010,1200);
        List<Araba> birinciArabaListesi = new ArrayList<>();
        birinciArabaListesi.add(birinciAraba);
        birinciArabaListesi.add(ikinciAraba);
        Person birinciKisi = new Person("cengiz",
                                    "yildiz",
                                    1122,
                                    birinciCocuk,
                                    birinciArabaListesi);
        return birinciKisi;
    }
    public Person person2(){
        Cocuk birinciCocuk = new Cocuk("xxx","yyyy",15,false);
        Araba birinciAraba = new Araba("xx",8888,888);
        Araba ikinciAraba = new Araba("yy",7777,777);
        List<Araba> birinciArabaListesi = new ArrayList<>();
        birinciArabaListesi.add(birinciAraba);
        birinciArabaListesi.add(ikinciAraba);
        Person ikinciKisi = new Person("cengiz",
                "yildiz",
                1122,
                birinciCocuk,
                birinciArabaListesi);
        return ikinciKisi;
    }
    public Person person3(){
        Cocuk birinciCocuk = new Cocuk("wwww","tttt",15,false);
        Araba birinciAraba = new Araba("www",9999,10);
        Araba ikinciAraba = new Araba("ttt",999,11);
        List<Araba> birinciArabaListesi = new ArrayList<>();
        birinciArabaListesi.add(birinciAraba);
        birinciArabaListesi.add(ikinciAraba);
        Person ucuncuKisi = new Person("cengiz",
                "yildiz",
                1122,
                birinciCocuk,
                birinciArabaListesi);
        return ucuncuKisi;
    }

}
