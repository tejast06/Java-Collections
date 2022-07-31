package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {

    public static void main(String[] args) {

        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add("abc");
        set1.add('a');
        System.out.println(set1);
        System.out.println(set1.size());
        System.out.println(set1.contains("abc"));

        set1.add("selenium");
        System.out.println(set1);

        //for each loop:
        System.out.println("for each loop");
        for(Object val:set1){
            System.out.println(val);
        }

        System.out.println("iterator");
        Iterator it = set1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
