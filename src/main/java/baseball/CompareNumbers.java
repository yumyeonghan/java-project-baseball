package baseball;

import java.util.List;

public class CompareNumbers {

    private List<Integer> computerNumber;
    private List<Integer> userNumber;

    public CompareNumbers() {
    }

    public void setComputerNumber(List<Integer> computerNumber) {
        this.computerNumber = computerNumber;
    }

    public void setUserNumber(List<Integer> userNumber) {
        this.userNumber = userNumber;
    }

    public int compareStrikeNumbers() {
        int strikeCount = 0;
        for (int i = 0; i < 3; i++) {
            if (this.computerNumber.get(i) == this.userNumber.get(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public int compareBallNumbers() {
        int ballCount = 0;
        for (int i = 0; i < 3; i++) {
            if (!(this.computerNumber.get(i) == this.userNumber.get(i))
                    && this.computerNumber.contains(this.userNumber.get(i))) {
                ballCount++;
            }
        }
        return ballCount;
    }
}
