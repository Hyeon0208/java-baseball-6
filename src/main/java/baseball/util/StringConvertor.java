package baseball.util;

import java.util.Arrays;
import java.util.List;

public class StringConvertor {
    private static final String SEPARATOR = "";

    private StringConvertor() {
    }

    public static String[] splitByBlank(String value) {
        return value.split(SEPARATOR);
    }

    public static List<Integer> StringNumberToIntegerList(String value) {
        String[] numbers = splitByBlank(value);
        return Arrays.stream(numbers)
                .map(Integer::parseInt)
                .toList();
    }
}
