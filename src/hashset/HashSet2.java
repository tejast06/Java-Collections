package hashset;

import java.util.HashSet;

public class HashSet2 {

    public static void main(String[] args) {
        HashSet<Integer>set1 = new HashSet<Integer>();
        set1.add(2);
        set1.add(4);
        set1.add(6);

        HashSet<Integer>set2 = new HashSet<Integer>();
        set2.addAll(set1);
        set2.add(10);
        System.out.println(set2);




    }
}
