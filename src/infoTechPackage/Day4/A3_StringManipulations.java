package infoTechPackage.Day4;

public class A3_StringManipulations {
    public static void main(String[] args) {
        String str = "Easy Java is Easy 12_34!";

        String str1 = str.replaceAll("Easy", "Kolay"); // String değişiminde kullanılır
        String str2 = str.replaceAll(" ", "*");
        String str3 = str.replaceAll("\\s", "*");
        String str4 = str.replaceAll("\\S", "*");
        String str5 = str.replaceAll("\\w", "*");
        String str6 = str.replaceAll("\\W", "*");
        String str7 = str.replaceAll("\\d", "*");
        String str8 = str.replaceAll("\\D", "*");
        String str9 = str.replace("a","u"); // Sadece Char değişiminde kullanılır.

        System.out.println(str9);
    }
}
