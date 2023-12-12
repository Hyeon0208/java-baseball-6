package baseball.view;

import baseball.view.validator.PlayerNumberValidator;
import baseball.view.validator.RetryCommandValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private InputView() {
    }

    public static String inputPlayerNumber() {
        String number = Console.readLine();
        PlayerNumberValidator.validate(number);
        return number;
    }

    public static String inputRetryCommand() {
        String command = Console.readLine();
        RetryCommandValidator.validate(command);
        return command;
    }
}
