import java.util.ArrayList;
import java.util.Collections;

public class SmartCombining {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);

        Collections.addAll(list2, 5, 10, 4, 3, 7);

        // remove comment when method ready
        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

    //Add 2 ArrayLists together without duplicating any #'s
    public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2){
        //Go through each value in list1
        for(int i = 0; i < list2.size(); i++){
            //If value from list1 is not in list2, add it to list2
            if(!list1.contains(list2.get(i)))
                list1.add(list2.get(i));
        }
    }
}
