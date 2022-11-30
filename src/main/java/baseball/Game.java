package baseball;

import java.util.List;

public class Game {
    private static final int NUMBER_SIZE = 3;
    private static final int NOTHING = 0;

    public static int strike(List<Integer> computerNumber, List<Integer> userNumber) {
        int strikeCount = 0;
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (computerNumber.get(i) == userNumber.get(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public static int ball(List<Integer> computerNumber, List<Integer> userNumber) {
        int ballCount = 0;
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (!(computerNumber.get(i) == userNumber.get(i)) && computerNumber.contains(userNumber.get(i))) {
                ballCount++;
            }
        }
        return ballCount;
    }

    public static boolean nothing(List<Integer> computerNumber, List<Integer> userNumber) {
        if (ball(computerNumber, userNumber) == NOTHING && strike(computerNumber, userNumber) == NOTHING) {
            return true;
        }
        return false;
    }
}
