package racingcar.View;

import camp.nextstep.edu.missionutils.Console;
import racingcar.View.Validation.CarListValidator;
import racingcar.View.Validation.TrialsValidator;


// 작업할때 항상 클래스를 먼저 생각하지말고 인터페이스를 먼저 생각하라

public class InputView implements IInputView {

    public String[] getCarNames() {
        System.out.println(InputPrompts.NAME.getMessage());
        String userInput = Console.readLine();
        CarListValidator.validateCarNames(userInput);
//        String userInput = 분리하는 로직
        CarListValidator.validateEachCarName(cars);
        return userInput.split(InputPrompts.DELIMITER.getMessage());
    }

    public int getTrials() {
        System.out.println(InputPrompts.TRIAL.getMessage());
        String trialInput = Console.readLine();
        return TrialsValidator.validateTrial(trialInput);

    }
}