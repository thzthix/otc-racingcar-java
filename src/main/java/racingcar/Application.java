package racingcar;


import racingcar.Repository.CarRepository;
import racingcar.Service.RoundPlayService;
import racingcar.View.InputView;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView input = new InputView();
        String[] names = input.getCarNames();
        CarRepository r = new CarRepository(names);
        //int trial = input.getTrials();
        RoundPlayService roundPlayService  = new RoundPlayService(r);
        roundPlayService.playRound();
        System.out.println(roundPlayService.determineWinners());
        //System.out.println(nameList.get(1).length());
        //

//        System.out.println(CarNameErrorMessages.EMPTY_NAME.getMessage());

    }
}
