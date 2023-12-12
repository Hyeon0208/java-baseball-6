package baseball.view.validator;

import baseball.constant.BseBallValue;

public class RetryCommandValidator {

    private RetryCommandValidator() {
    }

    public static void validate(String command) {
        validateCommandCondition(command);
    }

    private static void validateCommandCondition(String command) {
        if (!(command.equals(BseBallValue.RETRY_COMMAND) || command.equals(BseBallValue.QUIT_COMMAND))) {
            throw new IllegalArgumentException("1 또는 2만 입력할 수 있습니다.");
        }
    }
}
