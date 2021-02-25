package infoTechPackage.Day4;

public class A4_StringManipulations {
    public static void main(String[] args) {
        String str = "banana@gmail.com";
        //            0123456789012
        int i1= str.indexOf("@");
        System.out.println(i1);
        int i2= str.indexOf(".");
        System.out.println(i2);
        String str1 = str.substring(6); // yazılan numara dahil sonuna kadar kalan stringi yazdırır
        String str2 = str.substring(7,12
        ); // ilk numara dahil, ikinci numara hariç stringi yazdırır
        int begin = str.indexOf("@")+1;
        int finish = str.indexOf(".");
        String str3 = str.substring(begin ,finish);
        System.out.println(str3);
    }
}
