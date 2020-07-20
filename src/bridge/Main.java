package bridge;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        RandomDisplay d1 = new RandomDisplay(new StringDisplayImpl("Hello, Japan."));
        d1.randomDisplay(5);
    }
}
