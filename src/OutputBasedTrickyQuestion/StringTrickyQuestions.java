package OutputBasedTrickyQuestion;

public class StringTrickyQuestions {
    static void main() throws InterruptedException {
        String s1 = "himanshu";
        String s2 = "himanshu";
        System.out.println("checking s1 and s2 reference = "+s1==s2);

        String s3 = new String("himanshu");
        System.out.println("checking s1 and s3 reference = " + s3==s1);

        String s4 = new String("himanshu");
        System.out.println("checking s3 and s4 reference and value = " + s3.equals(s4) + " " + (s3 == s4));


        String s5 = new String("Java").intern();
        String s6 = "Java";
        System.out.println("checking s5 and s6 reference = " + s5==s6);

        String s7 = "Ja" + "va";
        String s8 ="Java";

        System.out.println("checking s7 and s8 reference = " +  s7==s8);

        String a = "Ja";
        String b = "va";
        String s9= a + b;
        String s10 = "Java";
        System.out.println("checking s9 and s10 reference = " +  s9 == s10);


        final String a1 = "Ja";
        final String b1 = "va";
        String s11 = a + b;
        String s12 = "Java";
        System.out.println("checking s11 and s12 reference = " +  s11 == s12);

        String s13 = "Java";
        String s14 = new StringBuilder("Java").toString();
        System.out.println("checking s13 and s14 reference = " +  s13 == s14);


        String s = "Java";
        s.concat("World");
        System.out.println("checking string concat = " +  s);

        String s15 = "Java";
        s15 = s15.concat("World");
        System.out.println("checking string concat and re-assign  = " + s15);

        String s16 = new String("Java");
        String s17 = s1.intern();
        String s18 = "Java";
        System.out.println("checking s16 and s17 reference = " +  s16 == s17);
        System.out.println("checking s17 and s18 reference = " +  s17 == s18);

        String s19 = null;
        System.out.println("checking string default value null  = " +  s19 == null);

        String s20 = "Java";
        String s21 = s1.replace("a", "o");
        String s22 = "Jovo";

        System.out.println(s20 == s21);
        System.out.println(s21.equals(s22));

        String s23 = "Java";
        String s24 = "Ja" + "va";
        String s25 = "Ja" + s2.substring(2);

        System.out.println(s23 == s24);
        System.out.println(s23 == s25);

        String s26 = "Hello";
        String s27 = s1 + "";
        String s28 = "Hello";

        System.out.println(s26 == s27);
        System.out.println(s26 == s28);

        stringBufferThreadSafe();
        stringBuilderNotThreadSafe();
        stringBuilderSynchronization();
        t3();
        stringImmutabilityInThread();
    }

    public static void stringBufferThreadSafe() throws InterruptedException {
        StringBuffer sb = new StringBuffer("Hi");

        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                sb.append("A");
            }
        };

        new Thread(r).start();
        new Thread(r).start();

        Thread.sleep(1000);
        System.out.println(sb.length());
    }
    public static void stringBuilderNotThreadSafe() throws InterruptedException {
        StringBuilder sb = new StringBuilder("Hi");

        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                sb.append("A");
            }
        };

        new Thread(r).start();
        new Thread(r).start();

        Thread.sleep(1000);
        System.out.println(sb.length());
    }

    public static void stringBuilderSynchronization() throws InterruptedException {
        StringBuilder sb = new StringBuilder("XY");

        Runnable r = () -> {
            synchronized (sb) {
                for (int i = 0; i < 1000; i++) {
                    sb.append("Y");
                }
            }
        };

        new Thread(r).start();
        new Thread(r).start();

        Thread.sleep(1000);
        System.out.println(sb.length());
    }
    public static void t3() throws InterruptedException {
        StringBuffer sb = new StringBuffer("A");

        Runnable r = () -> sb.append("B");

        new Thread(r).start();
        new Thread(r).start();

        Thread.sleep(500);
        System.out.println(sb.toString());
    }

    public static void stringImmutabilityInThread() throws InterruptedException {
        String s = "Hi";

        Runnable r = () -> {
            s.concat("Hello");
        };

        new Thread(r).start();
        new Thread(r).start();

        Thread.sleep(500);
        System.out.println(s);
    }

    public static void reAssignInThread() throws InterruptedException {
        StringBuilder sb = new StringBuilder("A");

        Runnable r = () -> {
           //  sb = sb.append("B");  not possible. Local variables in lambda must be effectively final.
        };

        new Thread(r).start();
        new Thread(r).start();

        Thread.sleep(500);
        System.out.println(sb.toString());
    }
}
