package baseball.view;

import baseball.view.validator.PlayerNumberValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private InputView() {
    }

    public static String inputPlayerNumber() {
        String number = Console.readLine();
        PlayerNumberValidator.validate(number);
        return number;
    }
}
