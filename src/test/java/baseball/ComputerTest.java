package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

class ComputerTest {

    private static final int ASSUMED_NUMBER = 100;

    Computer computer;

    @BeforeEach
    void init() {
        computer = new Computer();
    }

    @Test
    void generateNumber() {
        for (int i = 0; i < ASSUMED_NUMBER; i++) {
            List<Integer> computerNumbers = computer.generateNumber();
            int numberSize = computerNumbers.stream().distinct().collect(Collectors.toList()).size();
            Assertions.assertThat(numberSize).isEqualTo(3);
        }
    }
}