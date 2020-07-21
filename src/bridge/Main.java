package bridge;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CountDisplay d1 = new CountDisplay(new FileDisplayImpl("src/bridge/display.txt"));
        d1.display();
    }
}
