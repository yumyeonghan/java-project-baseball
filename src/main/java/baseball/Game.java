package baseball;

import java.util.List;

public class Game {
    private static final int NUMBER_SIZE = 3;

    public static boolean strike(List<Integer> computerNumber, List<Integer> userNumber) {
        for (int i = 0; i < NUMBER_SIZE; i++) {
            if (computerNumber.get(i) == userNumber.get(i)) {
                continue;
            }
            if (!(computerNumber.get(i) == userNumber.get(i))) {
                return false;
            }
        }
        return true;
    }
}
