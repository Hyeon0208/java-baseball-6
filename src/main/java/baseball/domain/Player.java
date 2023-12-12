package baseball.domain;

import java.util.List;

public class Player {
    private final List<Integer> numbers;

    public Player(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getNumberBy(int index) {
        return numbers.get(index);
    }
}
