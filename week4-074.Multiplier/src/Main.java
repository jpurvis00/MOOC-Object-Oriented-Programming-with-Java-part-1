
public class Main {

    public static void main(String[] args) {
        Multiplier threeMultiplier = new Multiplier(3);
        System.out.println("threeMultipler.multiply(2): " + threeMultiplier.multiply(2));  //6

        Multiplier fourMultiplier = new Multiplier(4);
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));  //8

        System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));  //3
        System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));  //4
    }
}
