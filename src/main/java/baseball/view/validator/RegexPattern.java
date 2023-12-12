package baseball.view.validator;

import java.util.regex.Pattern;

public enum RegexPattern {
    ONLY_NUMBER(Pattern.compile("^[0-9]*$")),
    ONE_TO_NINE(Pattern.compile("[1-9]+"));

    private final Pattern pattern;

    RegexPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public boolean matches(String value) {
        return pattern.matcher(value).matches();
    }
}
