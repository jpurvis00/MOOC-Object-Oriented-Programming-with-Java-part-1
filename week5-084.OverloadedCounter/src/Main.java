public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter cnt = new Counter();
        System.out.println("Constructor value: " + cnt.value());
        cnt.increase();
        cnt.increase();
        System.out.println("Constructor value: " + cnt.value());
        cnt.decrease();
        System.out.println("Constructor value: " + cnt.value());
        Counter cnt2 = new Counter(25);
        System.out.println("Constructor value: " + cnt2.value());
        Counter cnt3 = new Counter(-1, false);
        System.out.println("Constructor value: " + cnt3.value());
        Counter cnt4 = new Counter(2, true);
        System.out.println("Constructor value: " + cnt4.value());
        cnt4.increase(10);
        System.out.println("Constructor value: " + cnt4.value());
        cnt4.decrease(5);
        System.out.println("Constructor value: " + cnt4.value());

        Counter c = new Counter(2, true);
        c.decrease();
        c.decrease();
        c.decrease();
        System.out.println(c.value());
    }
}
