
final class Utility{

    void showTwo () {
        System.out.println("show two");
    }
}

class ShowOne  {
    final void show() {
        System.out.println("show method");
    }
}

class Student {

    final int rollNo;

    Student(int rollNo) {
        this.rollNo = rollNo;
    }
    void display() {
        System.out.println("Roll Number of the student = " + rollNo);
    }
}


public class FinalQuestions extends ShowOne{ // if u try to extend utility class it will give you error

    static final double PI = 3.14159;


    static void main() {
        final int x = 10;
        // x =20; final variable value cant be change

        Student st = new Student(10);
        // st.rollNo = 20; will not be allowed to change its value
        st.display();

        final StringBuilder sb = new StringBuilder("Hi");

        sb.append("Himanshu");
        // sb = new StringBuilder("Hello"); will give you an error cant not assign a value to a final variable
        // PI = 3.121212; again you will get an error saying that you cant not assign a value to final variable
        System.out.println(PI);
    }
     // void show() {} getting error final method cant be overridden
}
