package baseball;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {

    private List<Integer> computerNumber;
    private List<Integer> userNumber;

    @Test
    void 스트라이크() {
        computerNumber = new ArrayList<>(Arrays.asList(1,2,3));
        userNumber = new ArrayList<>(Arrays.asList(1,2,3));
        assertThat(Game.strike(computerNumber, userNumber)).isEqualTo(3);
    }

    @Test
    void 볼() {
        computerNumber = new ArrayList<>(Arrays.asList(3,1,2));
        userNumber = new ArrayList<>(Arrays.asList(1,2,3));
        assertThat(Game.ball(computerNumber, userNumber)).isEqualTo(3);
    }

}

