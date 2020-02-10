import java.util.Arrays;

public class Main {

    //Copy the passed in array into an entirely new array hence making a copy of it.
    public static int[] copy(int[] array){
        int[] newArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }

        return newArray;
    }

    //Creates a copy of the original array and reverses the order of the contents.
    public static int[] reverseCopy(int[] array){
        int[] revArray = new int[array.length];

        //Start at the end of the original array
        for(int i = array.length - 1; i >= 0; i--){
            //Put item into the first spot in the new array
            revArray[(array.length - 1) - i] = array[i];

            //Could also write the above line as
            revArray[i] = array[array.length - 1 - i];
        }

        return revArray;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reverse = reverseCopy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
        System.out.println( "reversed: " + Arrays.toString(reverse));
    }
    
}
