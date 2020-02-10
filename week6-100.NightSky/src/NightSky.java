import java.util.Random;

public class NightSky {
    //Object attributes/vars
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    //Objec constructors
    public NightSky(double density){
        this(density, 20, 10);
    }

    public NightSky(int width, int height){
        this(.1, width, height);
    }

    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }

    //Object methods
    //Print a line of * using the random # generator object.  Only print a * when
    //the random # matches the density # given.
    public void printLine(){
        Random randomizer = new Random();

        for(int i = 0; i < this.width; i++){
            if(randomizer.nextDouble() <= this.density) {
                System.out.print("*");
                starsInLastPrint++;
            }
            else
                System.out.print(" ");
        }
    }

    //Prints rows of stars using the printLine() method
    public void print(){
        this.starsInLastPrint = 0;
        for(int i = 0; i < this.height; i++){
            printLine();
            System.out.println();
        }
    }

    //Returns the # of stars that were printed
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}
