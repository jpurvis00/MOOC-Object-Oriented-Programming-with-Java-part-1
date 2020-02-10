
public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
        Integer numb = 1;

        while(numb <= 100){
            if(numb % 2 == 0)
                System.out.println(numb);

            numb++;
        }
    }
}
