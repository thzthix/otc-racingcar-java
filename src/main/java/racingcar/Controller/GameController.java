package racingcar.Controller;


import java.util.List;

import racingcar.Controller.dto.GameRequestDto;
import racingcar.Controller.dto.GameResponseDto;
import racingcar.Model.CarModel;
import racingcar.Service.IRoundPlayService;
import racingcar.Service.RoundPlayService;
import racingcar.View.IInputView;
import racingcar.View.IOutputView;
import racingcar.View.InputView;
import racingcar.View.OutputView;

// 닫힌 시스템이 된다 = 구현체를 갈아끼우는곳은 여기가 아니라 이걸 사용하러는 사용측에서 갈아끼워주면된다!
public class GameController {

    IRoundPlayService roundPlayService;

    public GameController(IRoundPlayService service) {
        this.roundPlayService = service;
    }

    public GameResponseDto playGame(GameRequestDto request) {
        for (int round = 0; round < request.getTrial(); round++) {
            // 2가지 방식 (1) GameRequestDto 내에서 직접 수행 / (2) 밖으로 꺼내어 수행
            roundPlayService.playRound();
            List<CarModel> currentCars = roundPlayService.getCurrentCars();
//            outputView.printRoundResults(currentCars);
        }
        roundPlayService.determineWinners();
    }
}
