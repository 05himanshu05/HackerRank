package OutputBasedTrickyQuestion;

public class Test1 {
    int a = 20;
    static {
        int a = 10;
        System.out.println("Static Block");
    }

    static {
        System.out.println("Second Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        Test1 t = new Test1();
        System.out.println(t.a);

        // static block will be called before main method
    }
}
