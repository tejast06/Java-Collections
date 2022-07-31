package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"selenium");
        hm.put(2,"java");
        hm.put(3,"c");
//        System.out.println(hm);
//        System.out.println(hm.size());
//        System.out.println(hm.get(1));
//
//        System.out.println(hm.containsKey(1));
//
//        System.out.println(hm.replace(1,"selenium","automation"));
//
//        System.out.println(hm);

//        System.out.println(hm.keySet());
//
//        System.out.println(hm.values());

//        System.out.println(hm.entrySet());
//
//        for (Object i:hm.keySet()){
//            System.out.println(i +" " +hm.get(i));
//        }

        for (Map.Entry entry: hm.entrySet()){
            System.out.println(entry.getKey() +"     " + entry.getValue());
        }

    }
}
