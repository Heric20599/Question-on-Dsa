package HASHMAP;
import java.util.*;

public class hashing{
    public static void main(String[] args) {
        HashMap < String ,Integer> map=new HashMap<>();
        map.put("rohit",78);
        map.put("rahul",90);
//        System.out.println(map.get("rahul"));
//        System.out.print(map);
//        System.out.println(map.containsKey("rahul"));// it gives bolean ans key
//        map.remove("rohit");
//        System.out.println(map);// to delete the key
        // print all the key and val
        System.out.println(map);
        System.out.println(map.containsKey("rohit"));


        }

    }
