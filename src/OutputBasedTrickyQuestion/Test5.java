package OutputBasedTrickyQuestion;

public class Test5 {

    void show(long l) {
        System.out.println("long");
    }

    void show(int i) {
        System.out.println("int");
    }

    void show(double i) {
        System.out.println("double");
    }

    void show(Integer i) {
        System.out.println("Integer");
    }

    static void main() {

        Test5 t5 = new Test5();

        t5.show(10.0);  // widening over power auto boxing
    }
}
