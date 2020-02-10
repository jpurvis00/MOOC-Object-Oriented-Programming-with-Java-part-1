import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        //Add all #'s in list
        for(int i : list){
            sum += i;
        }

        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return sum(list) / (double)list.size();
    }

    //Calculate variance
    public static double variance(ArrayList<Integer> list) {
        double sum = 0.0;
        double ave = average(list);

        for(int i : list){
           sum += Math.pow((i - ave), 2);
        }

        return sum / (list.size() - 1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
