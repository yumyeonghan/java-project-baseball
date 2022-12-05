package exception;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exception {

    private static final String RESTART = "1";
    private static final String EXIT = "2";

    public static void validateNumbers(String inputNumbers) {
        checkNonNumericCharacters(inputNumbers);

        checkDuplicateNumber(inputNumbers);
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

    public static void validateRestartNumbers (String inputNumber) {
        checkNumberFormat(inputNumber);
    }

    private static void checkNumberFormat(String inputNumber) {
        if (Arrays.stream(inputNumber.split("")).allMatch(number -> !(number.equals(RESTART) || number.equals(EXIT)))) {
            throw new IllegalArgumentException();
        }
    }
}