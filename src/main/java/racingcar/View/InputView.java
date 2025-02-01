package racingcar.View;

import camp.nextstep.edu.missionutils.Console;
import racingcar.View.Validation.CarListValidator;
import racingcar.View.Validation.TrialsValidator;


public class InputView {


    public String[] getCarNames() {
        System.out.println(InputPrompts.NAME.getMessage());
        String[] carNamesInArray = Console.readLine().split(InputPrompts.DELIMITER.getMessage());
        CarListValidator.validateCarNames(carNamesInArray);
        return carNamesInArray;

    }

    public int getTrials() {
        System.out.println(InputPrompts.TRIAL.getMessage());
        String trialInput = Console.readLine();
        return TrialsValidator.validateTrial(trialInput);

    }
}