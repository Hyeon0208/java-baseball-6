package baseball;

import baseball.controller.BaseBallController;
import baseball.domain.NumberGenerator;
import baseball.domain.RandomNumberGenerator;
import baseball.view.ErrorView;
import baseball.view.InputView;
import baseball.view.OutputView;
import baseball.view.handler.InputHandler;

public class Application {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        InputHandler inputHandler = initHandler();
        OutputView outputView = new OutputView();
        BaseBallController controller = new BaseBallController(numberGenerator, inputHandler, outputView);
        controller.start();
    }

    private static InputHandler initHandler() {
        InputView inputView = new InputView();
        ErrorView errorView = new ErrorView();
        return new InputHandler(inputView, errorView);
    }
}
