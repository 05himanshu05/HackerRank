package OutputBasedTrickyQuestion;


class A {

    static int x = 10;
}

public class SharedStaticVariable {

    static void main() {
        A a1 = new A();
        A a2 = new A();
        a1.x = 20;
        System.out.println(a2.x);

        final int[] arr = {1,2,3};

        arr[0] = 10; // final prevents reassignment, not mutation.
        // arr = new int[]{4, 5, 6}; //. reassignment is not allowed

        System.out.println(arr[0]);
    }
}
