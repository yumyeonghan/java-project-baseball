package baseball;

import java.util.List;

public class Game {
    private static final int NUMBER_SIZE = 3;
    private static final int NOTHING = 0;

    public static int strike(CompareNumbers compareNumbers) {
        int strikeCount = 0;
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (compareNumbers.getComputerNumber().get(i) == compareNumbers.getUserNumber().get(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public static int ball(CompareNumbers compareNumbers) {
        int ballCount = 0;
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (!(compareNumbers.getComputerNumber().get(i) == compareNumbers.getUserNumber().get(i))
                    && compareNumbers.getComputerNumber().contains(compareNumbers.getUserNumber().get(i))) {
                ballCount++;
            }
        }
        return ballCount;
    }

    public static boolean nothing(CompareNumbers compareNumbers) {
        if (ball(compareNumbers) == NOTHING && strike(compareNumbers) == NOTHING) {
            return true;
        }
        return false;
    }
}
