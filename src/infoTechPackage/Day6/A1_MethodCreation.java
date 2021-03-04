package infoTechPackage.Day6;

public class A1_MethodCreation {
    public static void main(String[] args) {

        System.out.println(ikiRakamTop(2,5));
        System.out.println(ikiRakamTop(8,58));
        System.out.println(ikiRakamTop(1456,563));
        System.out.println(ikiRakamCarp(2,5));
        System.out.println(ikiRakamCarp(8,58));
        System.out.println(ikiRakamCarp(1456,563));
        System.out.println(ikiRakamTopFloat(2.5f,5.34f));
        System.out.println(ikiRakamTopFloat(8.123456f,58.123456f));
        System.out.println(ikiRakamTopFloat(1456.45f,563.25f));

    }
    //*************************Burası Main Methodun dışında********************
    public static int ikiRakamTop(int a, int b){
        int c = a+b;
        return c;
    }
    public static int ikiRakamCarp(int a, int b){
        int c = a*b;
        return c;
    }
    public static float ikiRakamTopFloat(float a, float b){
        float c = a+b;
        return c;
    }
}
