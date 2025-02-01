package racingcar;


import racingcar.Repository.CarRepository;
import racingcar.View.TrialsValidator;
import racingcar.View.InputView;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView input = new InputView();
        String[] names = input.getCarNames();
        CarRepository r = new CarRepository(names);
        int trial = input.getTrials();
        System.out.println(trial);

        //System.out.println(nameList.get(1).length());
        //

//        System.out.println(CarNameErrorMessages.EMPTY_NAME.getMessage());

    }
}
