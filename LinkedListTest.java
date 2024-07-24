import java.util.*;

public class LinkedListTest{

    public static void main(String[] args) {

        List myNames = new LinkedList();

        myNames.add("Terry");
        myNames.add("James");
        myNames.add("Cindy");

        System.out.println();
        System.out.print("Our LinkedList contains: ");
        System.out.println("\t" + myNames);

        /* A map is used as a key, value pair tool
        HashMap & TreeMap */
        Map myMap = new HashMap();

        myMap.put("Maria", 19);
        myMap.put("Mark", 19);
        myMap.put("Sandra", 22);
        myMap.put("James", 30);

        System.out.println();
        System.out.println("The contents of the HashMap are: ");
        System.out.println("\t" + myMap);
    }
}