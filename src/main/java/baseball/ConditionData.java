package baseball;

public enum ConditionData {
    TERMINATION_CONDITION(3), EXIT_CONDITION("2"), RESTART_CONDITION("1");

    String number;

    ConditionData(String number) {
        this.number = number;
    }

    ConditionData(int number) {
        this.number = String.valueOf(number);
    }

    public String getNumberToString() {
        return number;
    }

    public int getNumberToInt() {
        return Integer.parseInt(number);
    }
}
