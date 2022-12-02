package controller;

import baseball.CompareNumbers;
import baseball.Computer;
import baseball.Game;
import view.Input;
import view.Output;

public class Controller {

    private static final String ERROR = "[ERROR]";
    private static final int TERMINATION_CONDITION = 3;

    private final Input input = new Input();
    private final Output output = new Output();

    public boolean run() {

        CompareNumbers compareNumbers = new CompareNumbers();
        Computer computer = new Computer();
        compareNumbers.setComputerNumber(computer.generateNumber());
        System.out.println("compareNumbers = " + compareNumbers.getComputerNumber());

        try {
            while (true) {
                compareNumbers.setUserNumber(input.inputNumber());
                output.printResult(compareNumbers);
                if (Game.strike(compareNumbers) == TERMINATION_CONDITION) {
                    if (input.restart() == 1) {
                        return true;
                    }
                    break;
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(ERROR);
        }
        return false;
    }
}
