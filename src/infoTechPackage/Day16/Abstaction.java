package infoTechPackage.Day16;

public abstract class Abstaction {
    String name ="ankara";
    //abstact class.lardan obje uretilemez.
    //constructor.ları yoktur.
    //body.li yada body.siz method tutabilirler.
    //abstract yada concrete class.ları child olarak kabul edebilirler.

    //abstract class.ları child class.ları bazı gorevleri
    // yapmak zorunda birakmak icin kullaniriz.

    //ben bir abstact methodum ve body.im yok.
    public abstract void method1();

    public void method2(){
        //ben bir concrete methodum.
    }

}
