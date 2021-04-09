package infoTechPackage.Day15;

public class Exceptions {

    //throws exception
    // List of Java Exceptions ile exceptions.lar kendi aralarında
    // parent child ilişkisi içindeler
    // throws ile istediğiniz satirda bir exception oluşturabilirsiniz.
    //throws keyword.u bir exception üretmeye yarar.
    public static void main(String[] args) {

        int yas = 999;
        if(yas>=18 && yas<150){
            System.out.println("ergen");
        } else if(yas<18 && yas>0){
            System.out.println("genç");
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
