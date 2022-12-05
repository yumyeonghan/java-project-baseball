package exception;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exception {

    public static void ValidateNumbers(String inputNumbers) {
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
}