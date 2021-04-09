package infoTechPackage.Day15;

import java.util.ServiceConfigurationError;

public class TyrCatchExceptions {


    public static void main(String[] args) {
        
        int a=50;
        int b=0;
        //int c = a/b;
        //java.lang.ArithmeticException
        String isim = "ankara";
        //String isim2 = isim.substring(15);
        //java.lang.StringIndexOutOfBoundsException

        try {
            int c = a/b;
        } catch (SecurityException e){
            System.out.println("matematik yakalandı");
        } catch (ArithmeticException e){
            System.out.println("string hatasi");
        } catch (ServiceConfigurationError e){
            System.out.println( "service hatasi");
        } catch (Exception e){
            System.out.println("diger tip hatalar");
        }
    }





}
