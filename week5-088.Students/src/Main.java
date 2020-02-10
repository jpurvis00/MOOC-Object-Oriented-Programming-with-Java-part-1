
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        //Test constructor, getters and toString
        Student pekka = new Student("Pekka Mikkola", "013141590");
        //System.out.println("name: " + pekka.getName());
        //System.out.println("studentnumber: " + pekka.getStudentNumber());
        //System.out.println(pekka);

        //Create a new arrayList of Student objects
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        //Start a loop until a blank has been entered for a name
        while(true){
            System.out.print("name: ");
            String name = reader.nextLine();

            if(!name.equals("")) {

                System.out.print("student number: ");
                String studentNumber = reader.nextLine();

                //Create new student object with name and studentNumber and add the new
                //object to the arrayList
                Student stu = new Student(name, studentNumber);
                list.add(stu);
            } else {
                System.out.println();
                break;
            }

        }

        //Print all objects from the ArrayList
        System.out.println();
        for(Student stu : list){
            System.out.println(stu);
        }

        //Ask for a search phrase to find in the arrayList
        System.out.println();
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();

        //Print out objects that have the search phrase in the name of the of the object
        System.out.println("Results: ");
        for(Student stu : list){
            if(stu.getName().contains(searchTerm))
                System.out.println(stu);
        }
    }
}
