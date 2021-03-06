package bridge;

import java.util.Random;

public class RandomDisplay extends CountDisplay {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        Random rand = new Random();
        multiDisplay(rand.nextInt(times));
    }
}
