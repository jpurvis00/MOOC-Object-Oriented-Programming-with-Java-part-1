
public class Main {

    public static void main(String[] args) {
        NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky = new NightSky(0.2, 15, 6);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());


        NightSky NightSky2 = new NightSky(8, 4);
        NightSky2.print();
        System.out.println("Number of stars: " + NightSky2.starsInLastPrint());
        System.out.println("");

        NightSky2.print();
        System.out.println("Number of stars: " + NightSky2.starsInLastPrint());

    }
}
