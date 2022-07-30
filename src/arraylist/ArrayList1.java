package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class ArrayList1 {

    public static void main(String[] args){

        //declare arraylist
        ArrayList al = new ArrayList();

        al.add("tejas");
        al.add(1);
        al.add(20.5);
        System.out.println(al);

        //to remove the element
        System.out.println(al.size());
        al.remove("tejas");
        System.out.println(al);

        //to add new element on particular index
        al.add(1,"toley");
        System.out.println(al);

        //to return the particular element
        System.out.println(al.get(0));

        //to replace the element
        al.set(0,3);
        System.out.println(al);

        //search element
        System.out.println(al.contains(3));

        //for loop:
        System.out.println("reading element using for loop");
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }

        //for each loop:
        System.out.println("reading element using for each loop");
        for(Object e:al){
            System.out.println(e);
        }










    }
}
