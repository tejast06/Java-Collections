package hashtable;

import java.util.Hashtable;

public class HashTable1 {

    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(1,"abc");
        ht.put(2,"def");
        System.out.println(ht);

        //ht.put(null,"fgh"); //null key not allowed
        //ht.put(3,null); //null value not allowed





    }
}
