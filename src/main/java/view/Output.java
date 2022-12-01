package view;

import baseball.CompareNumbers;
import baseball.Game;

public class Output {

    public void printResult(CompareNumbers compareNumbers) {
        int ballCount = Game.ball(compareNumbers);
        int strikeCount = Game.strike(compareNumbers);

        System.out.println(ballCount + "볼 " + strikeCount + "스트라이크");

        matchAllNumbers(strikeCount);

        matchNoNumbers(compareNumbers);
    }

    private void matchNoNumbers(CompareNumbers compareNumbers) {
        if (Game.nothing(compareNumbers)) {
            System.out.println("낫싱");
        }
    }

    private void matchAllNumbers(int strikeCount) {
        if (strikeCount == 3) {
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
    }

    public void printStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }
}
