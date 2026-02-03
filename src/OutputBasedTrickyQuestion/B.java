package OutputBasedTrickyQuestion;

class A1 {

    final int x =10;
    static int a = 10;
}

class C extends A1{

    final int x =20;
    static int a = 20;

}

public class B {

    static void main() {
        A1 c= new C();
        C c1= new C();
        System.out.println(c.x);
        System.out.println(c1.x);

        System.out.println(c.a);
        System.out.println(c1.a);

        // Fields are not polymorphic → resolved by reference type.
    }

}
