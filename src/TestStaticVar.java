class Counter {

    static int count = 0;
    Counter() {
        count++;
        System.out.println(count);
    }
}


class Utils {

    static void greet() {
        System.out.println("greet method");
    }
}

public class TestStaticVar {

    static void main() {
        new Counter();
        new Counter();
        new Counter();
        Utils.greet();
        }
}
