package controller;

import baseball.CompareNumbers;
import baseball.Computer;
import baseball.Game;
import view.Input;
import view.Output;

public class Controller {

    private static final int TERMINATION_CONDITION = 3;

    private final Input input = new Input();
    private final Output output = new Output();

    public boolean run() {
        CompareNumbers compareNumbers = initCompareNumbers();
        int inputNumber = 0; // 재시작,종료에 사용할 숫자 초기화

        while (true) {
            compareNumbers.setUserNumber(input.inputNumber());
            output.printResult(Game.gameResult(compareNumbers));

            inputNumber = getNumberInput(compareNumbers, inputNumber);
            if (checkRestartCondition(inputNumber)) return true;
            if (checkExitCondition(inputNumber)) return false;
        }
    }

    private CompareNumbers initCompareNumbers() {
        CompareNumbers compareNumbers = new CompareNumbers();
        Computer computer = new Computer();
        compareNumbers.setComputerNumber(computer.generateNumber());
        return compareNumbers;
    }

    private boolean checkExitCondition(int inputNumber) {
        if (inputNumber == 2) {
            return true;
        }
        return false;
    }

    private boolean checkRestartCondition(int inputNumber) {
        if (inputNumber == 1) {
            return true;
        }
        return false;
    }

    private int getNumberInput(CompareNumbers compareNumbers, int inputNumber) {
        if (Game.strike(compareNumbers) == TERMINATION_CONDITION) {
            inputNumber = input.restart();
        }
        return inputNumber;
    }
}
