
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        /*Money a = new Money(10,0);
        Money b = new Money(5,0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);          // NOTE: new Money-object is created and reference to that
                                // is assigned to variable a.
                                // The Money object 10.00e that variable a used to hold
                                // is not referenced anymore

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e
        */

        /*Money a = new Money(10,0);
        Money b = new Money(3,0);
        Money c = new Money(5,0);
        Money d = new Money(5,50);


        System.out.println(a.less(b));  // false
        System.out.println(b.less(c));  // true
        System.out.println(c.less(d));  // true
        */

        /*Money a = new Money(10,0);
        Money b = new Money(3,50);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);         // NOTE: new Money-object is created and reference to that is assigned to variable c
                                // the Money object 6.50e that variable c used to hold, is not referenced anymore

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
        */

        Money r1 = new Money(10, 70);
        Money r2 = new Money(7, 40);
        Money r3 = r1.minus(r2);
        Money r4 = r1.plus(r2);
        System.out.println(r4);
    }
}
