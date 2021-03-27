package infoTechPackage.Day14;

public class Yetiskin extends Insan{

    public Yetiskin() {
    }

    public Yetiskin(String lastName) {
        super("samet",1955);
        this.lastName = lastName;
    }

    String lastName = "yetiskinName";

    public void kitapOku(){
        System.out.println("ben kitap okurum");
    }

    public static void main(String[] args) {
        Yetiskin obj = new Yetiskin();
        obj.test();
    }
    public void test(){
        System.out.println(lastName);
        System.out.println(this.lastName);
        System.out.println(super.lastName);
        super.isOgrenci(15);
    }

}
