package infoTechPackage.Odev2;

public class Database {


    public static void main(String[] args) {
        AllPersonService obj = new AllPersonService();
        //System.out.println(obj.myPersonList.get(1).cocuk.age);
        obj.myAllPersons();
        for(Person w: obj.myPersonList){
            //for each sayesinde bütün ikilerin isimlerini yazdırdım
            System.out.println(w.cocuk);
        }
    }





}
