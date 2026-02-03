public class StaticandFinalQuestion {

    static int a = 1;

    int b = 1;

    static void main() {

        StaticandFinalQuestion h1 = new StaticandFinalQuestion();
        StaticandFinalQuestion h2 = new StaticandFinalQuestion();
        StaticandFinalQuestion h3 = new StaticandFinalQuestion();

        h1.a = 2;
        h2.a = 4;
        h3.a = 6;


        h1.b = 2;
        h2.b = 4;

        System.out.println(h1.a);
        System.out.println(h2.a);
        System.out.println(h3.a);

        System.out.println(h1.b);
        System.out.println(h2.b);
        System.out.println(h3.b);

    }
}
