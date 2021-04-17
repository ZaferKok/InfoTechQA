package infoTechPackage.Day17;

import java.util.*;

public class Collections01 {

    public static void main(String[] args) {

        System.out.println("list calismasi");
        String name = "ali";
        String name2 = new String();
        List<String> mylist = new ArrayList<>();
        mylist.add("ali");
        mylist.add("veli");
        mylist.add("ali");
        mylist.add("fatma");
        mylist.add("ayse");
        System.out.println(mylist);
        System.out.println(mylist.get(1));
        System.out.println(mylist.isEmpty());
        //////////////////////////////////////////////////
        System.out.println("set calismasi");
        Set<String> mySet = new HashSet<>();
        mySet.add("ali");
        mySet.add("veli");
        mySet.add("ali");
        mySet.add("fatma");
        mySet.add("ayse");
        System.out.println(mySet);
        ////////////////////////////////////////////
        System.out.println("queue calismasi");
        Queue <String> myQueue = new PriorityQueue<>();
        myQueue.add("ali");
        myQueue.add("veli");
        myQueue.add("ali");
        myQueue.add("fatma");
        myQueue.add("ayse");
        System.out.println(myQueue);
        System.out.println(myQueue.peek());
        //////////////////////////////////////
        System.out.println("map calismasi");
        Map<Integer,String>myMap = new HashMap<>();
        myMap.put(1,"ali");
        myMap.put(2,"ali");
        myMap.put(3,"ali");
        myMap.put(4,"ali");
        myMap.put(5,"ali");
        System.out.println(myMap);
        System.out.println(myMap.get(1));
        //////////////////////////////////////////////////
        Set<String> mySet2 = new HashSet<>();
        mySet2.add("gulsen");
        mySet2.addAll(mylist);
        System.out.println(mylist);
        System.out.println(mySet2);


    }

}
