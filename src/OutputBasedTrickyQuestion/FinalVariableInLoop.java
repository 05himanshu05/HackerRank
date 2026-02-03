package OutputBasedTrickyQuestion;

class Test7 {
    static {
        System.out.print("S ");
    }

    {
        System.out.print("I ");   // this is called Instance Block
    }

    Test7() {
        System.out.print("C ");
    }
}

class Counter {

    static int count = 0;

    Counter () {
        count++;
    }
}
public class FinalVariableInLoop {

    static void main() {
        final int a = 5;
        for (int i = 0; i < a; i++) {
            System.out.print(i + " ");
            }
        System.out.println();
        new Test7();
        new Test7();   // calling sequence would be Static → Instance Block → Constructor

        System.out.println();

        Counter c = new Counter();
        new Counter();
        new Counter();
        new Counter();
        new Counter();
        System.out.println(c.count);
        }
}
