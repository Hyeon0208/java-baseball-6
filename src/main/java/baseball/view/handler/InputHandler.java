package baseball.view.handler;

import baseball.view.ErrorView;
import baseball.view.InputView;
import java.util.function.Supplier;

public class InputHandler {
    private final InputView inputView;
    private final ErrorView errorView;

    public InputHandler(InputView inputView, ErrorView errorView) {
        this.inputView = inputView;
        this.errorView = errorView;
    }

    public String receiveValidatedPlayerNumber() {
        return receiveValidatedInput(inputView::inputPlayerNumber);
    }

    public String receiveValidatedRetryCommand() {
        return receiveValidatedInput(inputView::inputRetryCommand);
    }

    private <T> T receiveValidatedInput(Supplier<T> inputView) {
        while (true) {
            try {
                return inputView.get();
            } catch (IllegalArgumentException exception) {
                errorView.printErrorMessage(exception.getMessage());
            }
        }
    }
}
