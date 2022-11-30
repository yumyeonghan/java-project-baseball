package baseball;

import java.util.List;

public class Game {
    private static final int NUMBER_SIZE = 3;

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
}
