package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();
        list1.add("c");
        list1.add("x");
        list1.add("a");
        list1.addFirst("s");
        list1.addLast("t");

        LinkedList newList = new LinkedList();
        newList.addAll(list1);
        System.out.println(newList);

        //sort
        Collections.sort(list1);
        System.out.println(list1);

        //reverse order
        Collections.sort(list1,Collections.reverseOrder());
        System.out.println(list1);

        //shuffle
        Collections.shuffle(list1);
        System.out.println(list1);



    }
}
