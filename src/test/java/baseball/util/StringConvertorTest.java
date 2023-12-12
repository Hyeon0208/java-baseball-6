package baseball.util;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringConvertorTest {

    @DisplayName("입력받은 문자를 배열로 반환한다.")
    @Test
    void splitByBlank() {
        String number = "462";
        String[] expected = {"4", "6", "2"};

        String[] numbers = StringConvertor.splitByBlank(number);

        assertThat(numbers).isEqualTo(expected);
    }

    @Test
    void stringNumberToIntegerList() {
        String number = "396";
        List<Integer> expected = List.of(3, 9, 6);

        List<Integer> numbers = StringConvertor.StringNumberToIntegerList(number);

        assertThat(numbers).isEqualTo(expected);
    }
}