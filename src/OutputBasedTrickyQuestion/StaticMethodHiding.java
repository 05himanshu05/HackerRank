package OutputBasedTrickyQuestion;


class ParentOne {
    static void show() {
        System.out.println("In ParentOne show");
    }

    void showOne() {
        System.out.println("In ParentOne show One");
    }
}


class ChileOne extends ParentOne {
    static void show() {
        System.out.println("In ChileOne show");
    }
    void showOne() {
        System.out.println("In Chile One show");
    }
}


public class StaticMethodHiding {

    static void main() {
        ChileOne childRef = new ChileOne();
        ParentOne parentRef = new ChileOne();
        // ChileOne childOne = new ParentOne(); // Parent class cant be type of child
        parentRef.show();
        childRef.show();

        parentRef.showOne();
        childRef.showOne();
    }
}
