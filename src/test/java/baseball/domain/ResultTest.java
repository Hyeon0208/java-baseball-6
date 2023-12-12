package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ResultTest {
    Result result;

    @BeforeEach
    void init() {
        Computer computer = new Computer(List.of(1,2,3));
        Player player = new Player(List.of(1,2,3));
        result = Result.of(computer, player);
    }

    @DisplayName("3개의 번호가 일치하면 true")
    @Test
    void isThreeStrike() {
        boolean threeStrike = result.isThreeStrike();

        assertThat(threeStrike).isTrue();
    }

    @DisplayName("아무 결과가 없으면 true, 있으면 false")
    @Test
    void noResult() {
        boolean noResult = result.noResult();

        assertThat(noResult).isFalse();
    }
}