package infoTechPackage.Day11;

public class AnaClass {
    // Burası anasayfa
    public static void main(String[] args) {

        //        Overload demek aşırı yükleme demek. Bir metodunuz var ve aynı metodu birden
        //        farklı şekilde çalışacak şekilde tekrar
        //        farklı parametrelerle yazmaya method overload (metod aşırı yükleme) deniyor.

        //        Override: Metod override ise bununla pek alakalı değildir. En basit anlamda:
        //        atadan gelen bir metodun evlatda değişikliğe uğramasıdır.

        System.out.println(IkinciSayfa.toplama(4,8)); // Burada farklı Classtan çağırdık. bunun için Clasın ismi yazılması lazım.
        System.out.println(IkinciSayfa.toplama(4,8,7)); //OVERLOADING
        System.out.println(IkinciSayfa.toplama("Gönderilen String mesajı: ", 5)); //OVERLOADING
        System.out.println(IkinciSayfa.toplama(7,"Gönderilen String mesajı 2")); //OVERLOADING


        System.out.println(IkinciSayfa.ikiRakamCarp(4,8));


        System.out.println(ikiRakaminAyniSayfadaToplami(5,6));

    }

    public static int ikiRakaminAyniSayfadaToplami(int a, int b) {

        int c = a + b;
        return c;

    }


}
