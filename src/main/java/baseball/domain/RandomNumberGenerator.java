package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RandomNumberGenerator implements NumberGenerator {
    private static final int MIN_NUMBER_RANGE = 1;
    private static final int MAX_NUMBER_RANGE = 9;
    private static final int MAX_SIZE = 3;

    @Override
    public List<Integer> generateNumber() {
        Set<Integer> deduplicatedNumbers = new LinkedHashSet<>();
        while (deduplicatedNumbers.size() != MAX_SIZE) {
            deduplicatedNumbers.add(Randoms.pickNumberInRange(MIN_NUMBER_RANGE, MAX_NUMBER_RANGE));
        }
        return new ArrayList<>(deduplicatedNumbers);
    }
}
