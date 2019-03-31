package test.block8.test3;

import java.util.List;

public class MyClass extends Abstract1 implements Interface1 {
    @Override
    public void dosms() {

    }

    @Override
    public void dodef() {
        Interface1.dodef2();
    }

    public static double sqr(double arg) {
        while (true); // Удивительно, но КОМПИЛИРУЕТСЯ!
    }
}
