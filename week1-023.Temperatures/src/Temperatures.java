
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.
        while(true){
            System.out.println("Input floating point number or -999 to quit: ");
            Double tempature = Double.parseDouble(reader.nextLine());

            if(tempature == -999) break;
            else if(tempature >= -30.0 && tempature <= 40.0)
                Graph.addNumber(tempature);
            else
                System.out.println("Temp is not in range.  Re-enter temp.");
        }

        // Graph is used as follows:
        //Graph.addNumber(7);
        //double value = 13.5;
        //Graph.addNumber(value);
        //value = 3;
        //Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
