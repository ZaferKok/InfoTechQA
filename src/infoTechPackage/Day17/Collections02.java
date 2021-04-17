package infoTechPackage.Day17;

import java.util.*;

public class Collections02 {

    public static void main(String[] args) {
        String a = null;
        Integer b = null;


        Deque<String> mylist = new LinkedList<>();
        mylist.add("ali");
        mylist.add("veli");
        mylist.add("ali");
        mylist.add("fatma");
        mylist.add("ayse");
        mylist.addFirst("cengiz");
        System.out.println("set calismasi");
        Set<String> mySet = new HashSet<>(mylist);
        Set<String> myTreeSet = new TreeSet<>(mySet);
        //elimizdeki verilerde dublication var mi??
        if(mylist.size()==mySet.size()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //elimizdeki veri natural order.a gore sirali mi?
        ///





    }
}
