package exception;

public class Exception {

    public static void ValidateNumbers(String inputNumbers) {
        checkNonNumericCharacters(inputNumbers);
    }

    private static void checkNonNumericCharacters(String inputNumbers) {
        if (!inputNumbers.chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException();
        }
    }
}