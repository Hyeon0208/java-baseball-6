package baseball.controller;

import baseball.constant.BaseBallValue;
import baseball.domain.Computer;
import baseball.domain.NumberGenerator;
import baseball.domain.Player;
import baseball.domain.Result;
import baseball.util.StringConvertor;
import baseball.view.OutputView;
import baseball.view.handler.InputHandler;

public class BaseBallController {
    private final NumberGenerator numberGenerator;
    private final InputHandler inputHandler;
    private final OutputView outputView;

    public BaseBallController(NumberGenerator numberGenerator, InputHandler inputHandler, OutputView outputView) {
        this.numberGenerator = numberGenerator;
        this.inputHandler = inputHandler;
        this.outputView = outputView;
    }

    public void start() {
        outputView.printStartMessage();
        run(createComputer());
    }

    private void run(Computer computer) {
        while (true) {
            outputView.printPlayerNumberInputMessage();
            String number = inputHandler.receiveValidatedPlayerNumber();
            Player player = new Player(StringConvertor.StringNumberToIntegerList(number));
            Result result = Result.of(computer, player);
            outputView.printResult(result);
            if (result.isThreeStrike()) {
                break;
            }
        }
        retry();
    }

    private void retry() {
        outputView.printRetryMessage();
        String command = inputHandler.receiveValidatedRetryCommand();
        if (command.equals(BaseBallValue.RETRY_COMMAND)) {
            run(createComputer());
        }
    }

    private Computer createComputer() {
        return new Computer(numberGenerator.generateNumber());
    }
}
