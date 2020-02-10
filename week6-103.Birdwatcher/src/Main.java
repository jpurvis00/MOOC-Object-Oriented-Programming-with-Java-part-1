/*
I could have made this more readable by creating a method for each of the options.  The main then would
have looked like the following:

        Scanner scanner = new Scanner(System.in);
        BirdDatabase db = new BirdDatabase();

        while (true) {
            String command = ask(scanner, "?");
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add(scanner,db);
            } else if (command.equals("Observation")) {
                observation(scanner,db);
            } else if (command.equals("Show")) {
                show(scanner,db);
            } else if (command.equals("Statistics")) {
                statistics(scanner,db);
            } else {
                System.out.println("Unknown command!");
            }
        }
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        /*Create a new database object.  This will store all bird objects in an ArrayList in the
        database object.
         */
        Database db = new Database();

        while(true){
            System.out.print("? ");
            String option = reader.nextLine();

            if(option.toUpperCase().equals("QUIT"))
                break;

            //Option allows you to add a bird object to the db object
            if(option.toUpperCase().equals("ADD")){
                System.out.print("Name: ");
                String name = reader.nextLine();

                System.out.print("Latin Name: ");
                String lName = reader.nextLine();

                db.addBird(new Bird(name, lName));
            }

            //Option shows all objects in the db object
            if(option.toUpperCase().equals("STATISTICS"))
                db.statistics();

            //Option checks to see if name given matches a bird object and if so, increments
            //a var in the bird object by 1 keeping a count of how many times that bird has been observed
            if(option.toUpperCase().equals("OBSERVATION")){
                System.out.print("What was observed:? ");
                String name = reader.nextLine();
                db.observation(name);
            }

            //Option gets a name from the user and shows that bird objects info if it exists
            if(option.toUpperCase().equals("SHOW")) {
                System.out.print("What? ");
                String name = reader.nextLine();
                System.out.println(db.show(name));
            }

        }
    }

}
