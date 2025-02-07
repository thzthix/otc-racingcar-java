package racingcar;


import racingcar.Controller.GameController;
import racingcar.Controller.dto.GameRequestDto;
import racingcar.Controller.dto.GameResponseDto;
import racingcar.Service.RoundPlayService;
import racingcar.View.IInputView;
import racingcar.View.IOutputView;
import racingcar.View.InputView;
import racingcar.View.OutputView;


public class Application {

    static IInputView inputView = new InputView();
    static IOutputView outputView = new OutputView();

    public static void main(String[] args) {
        // 1) 필요한 객체들을 Initiate
        RoundPlayService service = new RoundPlayService();
        GameController gameController = new GameController(service);
        // 3) 플레이
        GameRequestDto request = inputView.getInformation();
        GameResponseDto response = gameController.playGame(request);
        // 2.2) OUTPUT
        outputView.printRound(response);
    }
}
