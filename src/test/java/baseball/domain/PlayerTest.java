package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PlayerTest {

    @ParameterizedTest
    @CsvSource({"0, 7", "1, 4", "2, 6"})
    void getNumberBy(int index, int expectedValue) {
        Player player = new Player(List.of(7, 4, 6));

        int indexValue = player.getNumberBy(index);

        assertThat(indexValue).isEqualTo(expectedValue);
    }
}