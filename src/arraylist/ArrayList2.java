package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

    public static void main(String[] args) {

        //declare arraylist
        ArrayList al = new ArrayList();
        al.add("b");
        al.add("c");
        al.add("a");
        al.add("d");

        ArrayList al1 = new ArrayList();
        al1.add(al);
        System.out.println(al1);

        // sort the element
        Collections.sort(al);
        System.out.println(al);

        //sort the element in reverse order:
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);


        //shuffle the element:
        Collections.shuffle(al);
        System.out.println(al);



    }
}
