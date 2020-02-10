
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    //Print contents of the array followed by a ,.  Do not print one on the last item
    public static void printElegantly(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if(i != array.length - 1)
                System.out.print(", ");
        }
    }
}
