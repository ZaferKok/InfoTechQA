package infoTechPackage.Day12;

import java.util.ArrayList;
import java.util.List;

public class Adam {

    public int number1=4;
    public int number2;
    private int kimlikNo =152456;
    private List<Object> varlik = new ArrayList<>();
    private String firstName = "veli";

    public void addNewVarlik(Object yeniVarlik) {
        this.varlik.add(yeniVarlik);
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getKimlikNo() {
        return kimlikNo;
    }

    public Object getVarlik() {
        return varlik;
    }

    public String getFirstName() {
        return firstName;
    }

    int topla(){
        int number3;
        return 3;
    }
    int carp(){
        return 4;
    }
    int bol(){
        for (int i=0;i<5;i++){
            int a=5;
            a=a+i;
        }
        return 5;
    }
}
