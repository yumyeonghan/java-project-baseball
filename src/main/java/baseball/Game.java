package baseball;

public class Game {

    private static final int NUMBER_SIZE = 3;
    private static final int NOTHING = 0;

    public Game() {
    }

    public static int strike(CompareNumbers compareNumbers) {
        return compareNumbers.compareStrikeNumbers();
    }

    public static int ball(CompareNumbers compareNumbers) {
        return compareNumbers.compareBallNumbers();
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
        String resultMessage = "3스트라이크" + "\n" + "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
        if (isNotCondition(strikeCount)) {
            resultMessage = judgeResult(ballCount, strikeCount, resultMessage);
        }
        if (Game.nothing(compareNumbers)) {
            resultMessage = "낫싱";
        }
        return resultMessage;
    }

    private static boolean isNotCondition(int strikeCount) {
        return strikeCount != ConditionData.TERMINATION_CONDITION.getNumberToInt();
    }

    private static String judgeResult(int ballCount, int strikeCount, String resultMessage) {
        if (ballCount != NOTHING && strikeCount != NOTHING) {
            resultMessage = ballCount + "볼 " + strikeCount + "스트라이크";
        }
        if (strikeCount != NOTHING && ballCount == NOTHING) {
            resultMessage = strikeCount + "스트라이크";
        }
        if (ballCount != NOTHING && strikeCount == NOTHING) {
            resultMessage = ballCount + "볼";
        }
        return resultMessage;
    }
}

