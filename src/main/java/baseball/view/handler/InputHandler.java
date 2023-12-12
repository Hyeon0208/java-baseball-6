package baseball.view.handler;

import baseball.view.ErrorView;
import baseball.view.InputView;
import java.util.function.Supplier;

public class InputHandler {

    private InputHandler() {
    }

    public static String receiveValidatedPlayerNumber() {
        return receiveValidatedInput(InputView::inputPlayerNumber);
    }

    private static <T> T receiveValidatedInput(Supplier<T> inputView) {
        while (true) {
            try {
                return inputView.get();
            } catch (IllegalArgumentException exception) {
                ErrorView.printErrorMessage(exception.getMessage());
            }
        }
    }
}
