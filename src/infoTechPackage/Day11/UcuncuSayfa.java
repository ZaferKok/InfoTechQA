package infoTechPackage.Day11;

public class UcuncuSayfa extends IkinciSayfa{

    // ikinciSayfadan gelen metod üçüncü sayfada evrim geçirir.
    public static int process(int a, int b) { // Parent Class a Extend ederek metodun değişikliğe uğratılmasına OVERRIDING denir.
        int c = (10*a) / b;
        return c;
    }
}
