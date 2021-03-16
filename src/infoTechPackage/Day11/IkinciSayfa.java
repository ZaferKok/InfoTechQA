package infoTechPackage.Day11;

public class IkinciSayfa {

    public static int toplama(int a, int b) {
        int c = a + b;
        return c;
    }
    public static int toplama(int a, int b, int c) {
        int f = a + b + c;
        return f;
    }

    public static double toplama(double a, String b) { //bu mathodun imzası ile asağıdaki metodun imzası farklıdır. imzada içine gönderilen parametreler rol oynar
        double c = a;
        System.out.println("işlem sonucunda toplam: ");
        System.out.println(b);
        return c;
    }
    public static double toplama(String a, double b) {
        double f = b;
        System.out.println("Tek toplam: ");
        System.out.println(a);
        return f;
    }

    public static int ikiRakamCarp(int a, int b) {
        int d = a * b;
        return d;
    }

    public static int process(int a, int b) {
        int c = a / b;
        return c;
    }

}
