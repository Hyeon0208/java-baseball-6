package baseball.view.validator;

import baseball.util.StringConvertor;

public class PlayerNumberValidator {
    private static final int MAX_SIZE = 3;

    private PlayerNumberValidator() {
    }

    public static void validate(String input) {
        validateFormat(input);
        validateSize(input);
        validateNumberRange(input);
    }

    private static void validateFormat(String input) {
        if (!RegexPattern.ONLY_NUMBER.matches(input)) {
            throw new IllegalArgumentException("숫자만 입력할 수 있습니다.");
        }
    }

    private static void validateSize(String input) {
        String[] numbers = StringConvertor.splitByBlank(input);
        if (numbers.length > MAX_SIZE) {
            throw new IllegalArgumentException("3자리의 숫자를 입력해야합니다.");
        }
    }

    private static void validateNumberRange(String input) {
        String[] numbers = StringConvertor.splitByBlank(input);
        for (String number : numbers) {
            if (!RegexPattern.ONE_TO_NINE.matches(number)) {
                throw new IllegalArgumentException("1 ~ 9 범위의 숫자만 입력할 수 있습니다.");
            }
        }
    }
}
