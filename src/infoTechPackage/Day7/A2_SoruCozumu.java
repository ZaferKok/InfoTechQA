package infoTechPackage.Day7;

public class A2_SoruCozumu {

    public static void main(String[] args) {


        //System.out.println(myFirstMethod("istanbul"));

        System.out.println(mySecondMethod("12"));
    }

    private static String myFirstMethod(String isim) {
        if (isim.length() < 2) {
            return isim;
        } else {
            return isim.substring(isim.length() - 1)
                    + isim.substring(1, isim.length() - 1)
                    + isim.substring(0, 1);
        }
    }

    protected static String mySecondMethod(String name) {
        String s = "";
        if (name.length() < 2) {
            return name;
        } else {
            s = name.substring(0, 2);
            return s + name + s;
        }

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        //............................
        if (weekday == false) {
            return true;
        } else {
            //.......................
            return false;
        }


    }

    public boolean icyHot(int temp1, int temp2) {
        return true;
    }
}
