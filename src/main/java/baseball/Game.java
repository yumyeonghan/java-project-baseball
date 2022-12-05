package baseball;

public class Game {
    private static final int NUMBER_SIZE = 3;
    private static final int NOTHING = 0;
    private static final int STRIKE_COUNT_3 = 3;

    public Game() {
    }

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
            if (!(compareNumbers.getComputerNumber().get(i) == compareNumbers.getUserNumber().get(i)) && compareNumbers.getComputerNumber().contains(compareNumbers.getUserNumber().get(i))) {
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

    public static String gameResult(CompareNumbers compareNumbers) {
        int ballCount = Game.ball(compareNumbers);
        int strikeCount = Game.strike(compareNumbers);

        if (strikeCount != STRIKE_COUNT_3) {
            if (ballCount != 0 && strikeCount != 0) {
                return ballCount + "볼 " + strikeCount + "스트라이크";
            }
            if (strikeCount != 0 && ballCount == 0) {
                return strikeCount + "스트라이크";
            }
            if (ballCount != 0 && strikeCount == 0) {
                return ballCount + "볼";
            }
        }
        if (Game.nothing(compareNumbers)) {
            return "낫싱";
        }
        return "3스트라이크" + "\n" + "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    }
}

