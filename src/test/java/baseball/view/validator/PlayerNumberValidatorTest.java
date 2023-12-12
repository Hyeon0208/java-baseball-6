package baseball.view.validator;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PlayerNumberValidatorTest {

    @DisplayName("숫자가 아닌 값을 입력하면 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"a", " ", "일"})
    void validateFormat(String input) {
        assertThatThrownBy(() -> PlayerNumberValidator.validate(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("3자리로 이뤄지지 않은 숫자를 입력하면 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"12345", "1", "12"})
    void validateSize(String input) {
        assertThatThrownBy(() -> PlayerNumberValidator.validate(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("1 ~ 9의 범위를 넘는 숫자를 입력하면 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"012", "204"})
    void validateNumberRange(String input) {
        assertThatThrownBy(() -> PlayerNumberValidator.validate(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}