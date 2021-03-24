package infoTechPackage.Odev2;

public class Cocuk {
    //cocugun yasi ve ogrenci mi(boolean) değiştirilebilir...
    String name;
    private String Lastname;
    int age;
    boolean ogrenci;

    public Cocuk() {
    }

    public Cocuk(String name, String lastname, int age, boolean ogrenci) {
        this.name = name;
        Lastname = lastname;
        this.age = age;
        this.ogrenci = ogrenci;
    }

    @Override
    public String toString() {
        return "Cocuk{" +
                "name='" + name + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", age=" + age +
                ", ogrenci=" + ogrenci +
                '}';
    }
}
