package baseball.view;

import baseball.domain.Result;

public class OutputView {

    public void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printPlayerNumberInputMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void printResult(Result result) {
        int strikeCount = result.getStrikeCount();
        int ballCount = result.getBallCount();
        if (ballCount == 0 && strikeCount > 0) {
            System.out.printf("%d스트라이크\n", strikeCount);
        }
        if (strikeCount == 0 && ballCount > 0) {
            System.out.printf("%d볼\n", ballCount);
        }
        if (ballCount > 0 && strikeCount > 0) {
            System.out.printf("%d볼 %d스트라이크\n",ballCount, strikeCount);
        }
        if (result.noResult()) {
            System.out.println("낫싱\n");
        }
    }

    public void printRetryMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
