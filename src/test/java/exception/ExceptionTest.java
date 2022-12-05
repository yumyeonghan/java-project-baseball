package exception;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ExceptionTest {

    @ValueSource(strings = {"1,2,2"})
    @ParameterizedTest
    void 중복된_숫자_검증_테스트(String inputNumbers) {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> Exception.validateNumbers(inputNumbers))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @ValueSource(strings = {"1,2,a"})
    @ParameterizedTest
    void 숫자_검증_테스트(String inputNumbers) {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> Exception.validateNumbers(inputNumbers))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @ValueSource(strings = {"1,2"})
    @ParameterizedTest
    void 숫자_길이_테스트(String inputNumbers) {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> Exception.validateNumbers(inputNumbers))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }
}