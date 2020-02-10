import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));

        int[] values2 = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values2));

        int[] values3 = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values3, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values3, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values3, 4));

        int[] values4 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(values4) );

        swap(values, 1, 0);
        System.out.println( Arrays.toString(values4) );

        swap(values, 0, 3);
        System.out.println( Arrays.toString(values4) );

        int[] values5 = {8, 3, 7, 9, 1, 2, 4};
        sort(values5);
        System.out.println(Arrays.toString(values5));

    }

    //Finds the smallest # in an array
    public static int smallest(int[] array){
        int smallest = array[0];

        for(int i = 0; i < array.length - 1; i++){
            if(smallest > array[i + 1])
                smallest = array[i + 1];
        }

        return smallest;
    }

    //Finds the index of the smallest # in an array
    public static int indexOfTheSmallest(int[] array){
        int smallest = smallest(array);

        for(int i = 0; i < array.length; i++){
            if(array[i] == smallest)
                return i;
        }

        return -1;
    }

    //Finds the index of the smallest # in the subarray which starts at index.
    //ex. arr[2, 5, 3, 4} index = 2  searches through the subarray[3, 4]
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallest = array[index];
        int indexOfSmallest = index;

        for(int i = index; i < array.length - 1; i++){
            if(smallest > array[i + 1]){
                smallest = array[i + 1];
                indexOfSmallest = i + 1;
            }
        }

        return indexOfSmallest;
    }

    //Swaps the values from an array using the specified indexes.
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    //Perform selection sorting
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++) {
            int indexOfSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, indexOfSmallest);
        }
    }
}
