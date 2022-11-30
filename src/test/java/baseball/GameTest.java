package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GameTest {
    @Test
    void 스트라이크() {
        List<Integer> computerNumber = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> userNumber = new ArrayList<>(Arrays.asList(1,2,3));
        Assertions.assertThat(Game.strike(computerNumber, userNumber)).isEqualTo(3);
    }

}

