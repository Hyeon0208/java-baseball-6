package baseball.domain;

public class Result {
    private final int strikeCount;
    private final int ballCount;

    private Result(int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
    }

    public static Result of(Computer computer, Player player) {
        int strikeCount = 0;
        int ballCount = 0;
        for (int i = 0; i < 3; i++) {
            if (computer.getNumberBy(i) == player.getNumberBy(i)) {
                strikeCount++;
                continue;
            }
            if (computer.contains(player.getNumberBy(i))) {
                ballCount++;
            }
        }
        return new Result(strikeCount, ballCount);
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public boolean isThreeStrike() {
        return strikeCount == 3;
    }

    public boolean noResult() {
        if (strikeCount == 0 && ballCount == 0) {
            return true;
        }
        return false;
    }
}
