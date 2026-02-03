package OutputBasedTrickyQuestion;

public class Overloading {

    void show(String s) {
        System.out.println("String");
    }

    void show(Object o) {
        System.out.println("Object");
    }

    static void main() {
        Overloading os = new Overloading();
        os.show(null);   // in this case most specific choose
    }
}
