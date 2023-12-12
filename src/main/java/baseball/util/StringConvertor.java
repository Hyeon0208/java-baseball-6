package baseball.util;

import java.util.Arrays;
import java.util.List;

public class StringConvertor {

    private StringConvertor() {
    }

    public static String[] splitByBlank(String value) {
        return value.split("");
    }

    public static List<Integer> StringNumberToIntegerList(String value) {
        String[] numbers = splitByBlank(value);
        return Arrays.stream(numbers)
                .map(Integer::parseInt)
                .toList();
    }
}
