package infoTechPackage.Day4;

public class A2_StringManipulations {
    public static void main(String[] args) {
        String str = "Banana, anpplean";
        //            0123456789012
        int indx1 = str.lastIndexOf("a");
        int indx2 = str.lastIndexOf("an");
        int indx3 = str.lastIndexOf("Ban");
        int indx4 = str.lastIndexOf("an",7);
        System.out.println(indx4);
    }
}
