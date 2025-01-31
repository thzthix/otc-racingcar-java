package racingcar;


import java.util.Arrays;
import java.util.List;
import racingcar.Repository.CarRepository;
import racingcar.Validation.CarNameErrorMessages;
import racingcar.Validation.CarNameValidator;
import racingcar.Validation.TrialsValidator;
import racingcar.View.InputView;

public class Application {

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView input = new InputView();
        String names = input.getCarNames();
        String[] nameList = names.split(",");
        CarRepository r = new CarRepository(nameList);
        String trial = input.getTrials();
        TrialsValidator validator1 = new TrialsValidator();
        int trials = validator1.validateTrial(trial);
        System.out.println(trials);

        //System.out.println(nameList.get(1).length());
        //

//        System.out.println(CarNameErrorMessages.EMPTY_NAME.getMessage());

    }
}
