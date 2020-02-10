public class Main {
  public static void main(String[] args) {
    // write test code here
    /*Person pekka = new Person("Pekka", 15, 2, 1993);
    Person steve = new Person("Thomas", 1, 3, 1955);

    System.out.println( steve.getName() + " age " + steve.age() + " years");
    System.out.println( pekka.getName() + " age " + pekka.age() + " years");

    Person jeff = new Person("Jeff", 15, 2, 1983);
    Person steph = new Person("Steph", 1, 3, 1983);

    System.out.println( jeff.getName() + " is older than " +  steph.getName() + ": "+ jeff.olderThan(steph) );
    System.out.println( steph.getName() + " is older than " +  jeff.getName() + ": "+ steph.olderThan(jeff) );
    */

    Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
    Person steve = new Person("Steve");

    System.out.println( pekka );
    System.out.println( steve );

    Person helga = new Person("Helga", new MyDate(31, 12, 2009));
    Person janika = new Person("Janika", new MyDate(1, 1, 2010));

    System.out.println( helga.getName() + " is older than " +  janika.getName() + ": "+ helga.olderThan(janika) );
  }
}
