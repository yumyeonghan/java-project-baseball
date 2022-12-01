package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {

    CompareNumbers compareNumbers;

    @BeforeEach
    void init() {
        compareNumbers = new CompareNumbers();
    }

    @Test
    void 스트라이크() {
        compareNumbers.setComputerNumber(new ArrayList<>(Arrays.asList(1, 2, 3)));
        compareNumbers.setUserNumber(new ArrayList<>(Arrays.asList(1, 2, 3)));
        assertThat(Game.strike(compareNumbers)).isEqualTo(3);
    }

    @Test
    void 볼() {
        compareNumbers.setComputerNumber(new ArrayList<>(Arrays.asList(1, 2, 3)));
        compareNumbers.setUserNumber(new ArrayList<>(Arrays.asList(3, 1, 2)));
        assertThat(Game.ball(compareNumbers)).isEqualTo(3);
    }

    @Test
    void 낫싱() {
        compareNumbers.setComputerNumber(new ArrayList<>(Arrays.asList(1, 2, 3)));
        compareNumbers.setUserNumber(new ArrayList<>(Arrays.asList(4, 5, 6)));
        assertThat(Game.nothing(compareNumbers)).isTrue();
    }
}

