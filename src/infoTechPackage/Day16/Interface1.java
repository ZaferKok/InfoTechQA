package infoTechPackage.Day16;

public interface Interface1 {
    String name = "ankara";
    //interface icinde sadece abstract class.lar olur.
    //interface icinde kod yigini olmaz, sadece baglanan class.ların yapacakları isler olur.
    //abstract class.lar gibi abstract keyword.unu kullanmanıza gerek yoktur.
    //ınterface icinde yazılan tum methodlar abstract method olmak zorunda oldugu icin
    //abstarct keyword.unu kullanmanıza gerek yoktur.
    //interface icindeki tum methodlar public olmalıdır.
    //interface icindeki tum variable.ler public, static, final olmalı ve initialize edilmedilir.
    //sen public,static ve final yazmasan bile bu degerler otomatik olarak public, static ve final olur.
    //ama sen initialize etmelisin. java bunu yapamaz.

    void method1();
    String method2();
    Integer method3();

}
