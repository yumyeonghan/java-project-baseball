package view;

import baseball.CompareNumbers;
import baseball.Game;

public class Output {

    public Output() {
    }

    public void printResult(CompareNumbers compareNumbers) {
        int ballCount = Game.ball(compareNumbers);
        int strikeCount = Game.strike(compareNumbers);

        if (!matchAllNumbers(strikeCount)) {
            if (ballCount != 0 && strikeCount != 0) {
                System.out.println(ballCount + "볼 " + strikeCount + "스트라이크");
            }
            if (strikeCount != 0 && ballCount == 0) {
                System.out.println(strikeCount + "스트라이크");
            }
            if (ballCount != 0 && strikeCount == 0) {
                System.out.println(ballCount + "볼");
            }
        }

        matchNoNumbers(compareNumbers);
    }

    private void matchNoNumbers(CompareNumbers compareNumbers) {
        if (Game.nothing(compareNumbers)) {
            System.out.println("낫싱");
        }
    }

    private boolean matchAllNumbers(int strikeCount) {
        if (strikeCount == 3) {
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }
        return false;
    }
}
