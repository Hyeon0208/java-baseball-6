package baseball.validation;

import baseball.view.ErrorMessage;
import baseball.view.RegexPattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberFormatValidator {

    private NumberFormatValidator() {
    }

    public static void validate(String numbers) {
        Pattern pattern = Pattern.compile(RegexPattern.ONLY_NUMBER.getValue());
        Matcher matcher = pattern.matcher(numbers);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(ErrorMessage.NUMBER_TYPE.getMessage());
        }
    }
}
