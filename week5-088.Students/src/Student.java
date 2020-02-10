public class Student {
    //Object vars
    private String name;
    private String studentNumber;

    //Object constructor
    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    //Object methods
    public String getName(){
        return this.name;
    }

    public String getStudentNumber(){
        return this.studentNumber;
    }

    public String toString(){
        return this.name + " (" + this.studentNumber + ")";
    }
}
