package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ComputerTest {
    Computer computer;

    @BeforeEach
    void init() {
        computer = new Computer(List.of(3, 4, 5));
    }

    @DisplayName("각 인덱스에 해당하는 번호를 가져온다.")
    @ParameterizedTest
    @CsvSource({"0, 3", "1, 4", "2, 5"})
    void getNumberBy(int index, int expectedValue) {
        int indexValue = computer.getNumberBy(index);

        assertThat(indexValue).isEqualTo(expectedValue);
    }

    @DisplayName("숫자를 포함하면 true, 포함하지 않으면 false를 반환한다.")
    @ParameterizedTest
    @CsvSource({"5, true", "4, true", "3, true", "9, false"})
    void contains(int number, boolean expected) {
        boolean contains = computer.contains(number);

        assertThat(contains).isEqualTo(expected);
    }
}