package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

    public static void main(String[] args) {

        String arr[] = {"abc","def"};

        for(String value:arr){
            System.out.println(value);
        }

        //declare arraylist
        ArrayList al = new ArrayList(Arrays.asList(arr));
        System.out.println(al);

    }
}
