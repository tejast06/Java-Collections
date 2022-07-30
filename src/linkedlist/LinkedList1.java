package linkedlist;

import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {

        LinkedList list1 = new LinkedList();
        list1.add(0);
        list1.add('a');
        list1.add("abc");
        System.out.println(list1);
        System.out.println(list1.size());

        list1.remove(1);
        System.out.println(list1);

        System.out.println(list1.getFirst());

        System.out.println(list1.getLast());

        //for each loop:
        System.out.println("for each loop");
        for (Object value:list1){
            System.out.println(value);
        }



    }
}
