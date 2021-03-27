package infoTechPackage.Day13;

public class StringBuilderDersi {
    public static void main(String[] args) {
        String name = "istanbul";
        //string.de atama işlemi yok. ne yaparsan yap string değişmez.
        name.substring(2,6).toLowerCase().toUpperCase();
        System.out.println(name);
        //elindeki string.i stringbuilder haline çevirebilirsin.
        StringBuilder myString3 = new StringBuilder(name);
        StringBuilder myString = new StringBuilder("ankara");
        //"ankara" şeklinde bir stringbuilder olusturduk.
        System.out.println(myString);
        //string.e xxxx eklemesi yaptik.
        System.out.println(myString.append(" xxxx"));
        //ekleme string.de kalici hale geldi.
        System.out.println(myString);
        myString.append(" yyyy");
        System.out.println(myString);//ankara xxxx yyyy
        myString.append("123456",0,2);
        System.out.println(myString);//ankara xxxx yyyy12
        //olusturdugunuz string builderın uzunlugunu belirleyebilirsiniz.
        StringBuilder myString2 = new StringBuilder(5);
        myString2.append("istanbul");
        System.out.println(myString2);
        System.out.println(myString2.charAt(3));//a
        System.out.println(myString2.delete(4, 6));//istaul 4dahil 6 hariç elemanları sildi ve aklında tuttu.
        System.out.println(myString2.deleteCharAt(1));//itaul..1. index.teki elemanı 's' siler.
        System.out.println(myString.equals(myString2));//false doner
        System.out.println(myString2.indexOf("t"));//1. index.te mevcut.
        //3. index.ten itibaren verilen stringi ekle.
        System.out.println(myString2.insert(3, "almanya"));
        //3. index.ten itibaren verilen stingin 1,3 index arasını ekle
        System.out.println(myString2.insert(3,"0123456", 1, 3));
        //3-8 arasını verilen string ile değistir.
        System.out.println(myString2.replace(3, 8, "TTT"));
        //stringi ters çevir.
        System.out.println(myString2.reverse());
        //3. index.teki char.ı 'h' yap.ayrıca syso içine koymak gerekir.
        myString2.setCharAt(3,'h');
        System.out.println(myString2);
        //3-8 arasını bana ver
        System.out.println(myString2.subSequence(3, 8));
        //string builder.ı stirng.e çevirir.
        //System.out.println(myString2.toString());
        //atama yapabiliriz.
        String s = myString2.toString();
    }
}
