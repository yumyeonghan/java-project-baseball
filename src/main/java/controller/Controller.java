package controller;

import baseball.CompareNumbers;
import baseball.Computer;
import baseball.ConditionData;
import baseball.Game;
import view.Input;
import view.Output;

public class Controller {

    private final Input input = new Input();
    private final Output output = new Output();

    public boolean run() {
        CompareNumbers compareNumbers = initCompareNumbers();
        String inputNumber = ""; // 재시작,종료에 사용할 숫자 초기화

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

    private boolean checkExitCondition(String inputNumber) {
        if (inputNumber.equals(ConditionData.EXIT_CONDITION.getNumberToString())) {
            return true;
        }
        return false;
    }

    private boolean checkRestartCondition(String inputNumber) {
        if (inputNumber.equals(ConditionData.RESTART_CONDITION.getNumberToString())) {
            return true;
        }
        return false;
    }

    private String getNumberInput(CompareNumbers compareNumbers, String inputNumber) {
        if (Game.strike(compareNumbers) == ConditionData.TERMINATION_CONDITION.getNumberToInt()) {
            inputNumber = input.restart();
        }
        return inputNumber;
    }
}
