package Facade;

public class Hello {

    public String sayHello(String name) {

       String cr1, cr2;
       Boolean b1, b2;

        cr1 = "LARS";
        cr2 = "bo";

        b1 = true;
        b2 = true;

        if (name != null) {

            String s = "Hello, " + name;
            return s;

        } else {
            String m = "Hello, my friend";
            return m;
        }
    }
}
