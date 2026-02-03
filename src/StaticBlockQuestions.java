public class StaticBlockQuestions {

    static {
        System.out.println("Inside Static Block");
    }

    StaticBlockQuestions() {
        System.out.println("Inside StaticBlockQuestions class constructor ");
    }

    static void main() {
        System.out.println("Inside main mehtod ");
        new StaticBlockQuestions();
    }

}
