package infoTechPackage.Odev2;

import java.util.List;

public class Person {
//    person: isim, soyad, kimlikno, cocuk, araba
//    cocuk: isim, soyad, yas, ogrenciMi?
//    araba: model,yıl,guncelFiyat
//    bir person.un sadece bir cocugu olabilir...(List değil), kimlik no değiştirilemez
//    cocugun sayı ve ogrenci mi(boolean) değiştirilebilir...
//    person.un birden fazla arabası olabilir...(list)...sadece guncel fiyatı değiştirilebilir
//    bana 3 tane person hazırlayın, hepsinin 1er çocuğu olsun, sırasıyla 1,2,3 arabası olsun...
//    herbir person oluşturma işlemini main methodu olan runner class.ınızdaki porson1,2,3 methodlarında yapın...main methodunda sacede person1,2,3 methodlarını çağıracaksınız...
//    ayrıca birer tane person, cocuk, araba classlarınız olacak. Bunlarla ilgili bütün işlemler bu classlarda yapılacak...
    String name;
    String lastname;
    int kimlikNo;
    Cocuk cocuk;
    List<Araba> arabalarim;

    public Person() {
    }

    public Person(String name, String lastname, int kimlikNo, Cocuk cocuk, List<Araba> arabalarim) {
        this.name = name;
        this.lastname = lastname;
        this.kimlikNo = kimlikNo;
        this.cocuk = cocuk;
        this.arabalarim = arabalarim;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", kimlikNo=" + kimlikNo +
                ", cocuk=" + cocuk +
                ", arabalarim=" + arabalarim +
                '}';
    }
}
