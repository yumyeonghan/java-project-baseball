package exception;

import baseball.ConditionData;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exception {

    private static final int REQUIRED_NUMBER_LENGTH = 3;

    public static void validateNumbers(String inputNumbers) {
        checkNonNumericCharacters(inputNumbers);
        checkDuplicateNumber(inputNumbers);
        checkNumberLength(inputNumbers);
    }

    private static void checkNumberLength(String inputNumbers) {
        if (inputNumbers.length() != REQUIRED_NUMBER_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    private static void checkDuplicateNumber(String inputNumbers) {
        if (Arrays.stream(inputNumbers.split("")).collect(Collectors.toSet()).size() != inputNumbers.length()) {
            throw new IllegalArgumentException();
        }
    }

    private static void checkNonNumericCharacters(String inputNumbers) {
        if (!inputNumbers.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException();
        }
    }

    public static void validateNumberFormat(String inputNumber) {
        checkNumberFormat(inputNumber);
    }

    private static void checkNumberFormat(String inputNumber) {
        if (Arrays.stream(inputNumber.split("")).allMatch(number -> !(number.equals(ConditionData.RESTART_CONDITION.getNumberToString())
                || number.equals(ConditionData.EXIT_CONDITION.getNumberToString())))) {
            throw new IllegalArgumentException();
        }
    }
}