package racingcar;


import racingcar.Controller.GameController;
import racingcar.Repository.CarRepository;
import racingcar.Service.RoundPlayService;
import racingcar.View.InputView;

public class Application {

    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.playGame();

    }
}
