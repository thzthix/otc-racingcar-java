package racingcar;


import java.util.Arrays;
import java.util.List;
import racingcar.Validation.CarNameErrorMessages;
import racingcar.Validation.CarNameValidator;
import racingcar.View.InputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView input = new InputView();
        String names = input.getCarNames();
        List<String> nameList = Arrays.stream(names.split(",")).toList();
        CarNameValidator validator = new CarNameValidator();
            validator.validateCarName(nameList);

        //System.out.println(nameList.get(1).length());
        //input.getTrials();
//        System.out.println(CarNameErrorMessages.EMPTY_NAME.getMessage());


    }
}
