package racingcar.Controller;


import java.util.List;
import racingcar.Service.RoundPlayService;
import racingcar.View.InputView;
import racingcar.View.OutputView;

public class GameController {

    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    RoundPlayService roundPlayService = new RoundPlayService();

    public void playGame() {
        initiateGame();
        int trials = inputView.getTrials();
        playRounds(trials);
        finishGame();
    }

    public void initiateGame() {
        String[] carNameInput = inputView.getCarNames();
        roundPlayService.initiateRepository(carNameInput);
    }

    public void playRounds(int trials) {
        for (int round = 0; round < trials; round++) {
            roundPlayService.playRound();
        }
    }

    public void finishGame() {
        List<String> winners = roundPlayService.determineWinners();
        outputView.displayWinners(winners);
    }

}
