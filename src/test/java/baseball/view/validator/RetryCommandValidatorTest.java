package baseball.view.validator;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RetryCommandValidatorTest {

    @DisplayName("1 또는 2가 아닌 값을 입력하면 예외가 발생한다.")
    @ParameterizedTest
    @ValueSource(strings = {"0", "a", ""})
    void validateCommandCondition(String input) {
        assertThatThrownBy(() -> RetryCommandValidator.validate(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}