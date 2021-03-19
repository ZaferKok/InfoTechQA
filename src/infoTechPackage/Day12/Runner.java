package infoTechPackage.Day12;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    //Ahmet ahmet = new Ahmet();
    //c://user.desktop.yeniklasor.....

    Adam myobject = new Adam();
    List<Integer> myList = new ArrayList<>();

    String myName = new String();
    String myLastname;

    int myFirstMethod(){
        return myobject.bol()+myobject.carp()+8;
    }

    List<Integer> mySecondList (){
        myList.add(myobject.number1);
        myList.add(myobject.number2);
        myList.add(myobject.topla());
        myList.add(myobject.bol());
        return myList;
    }


}
