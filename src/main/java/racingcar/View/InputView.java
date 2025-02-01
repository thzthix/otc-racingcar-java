package racingcar.View;

import camp.nextstep.edu.missionutils.Console;


public class InputView {

    private final String DELIMITER = ",";

    public String[] getCarNames() {
        System.out.println(InputPrompts.NAME);
        String[] carNamesInArray = Console.readLine().split(DELIMITER);
        CarListValidator.validateCarNames(carNamesInArray);
        return carNamesInArray;

    }

    public int getTrials() {
        System.out.println(InputPrompts.TRIAL);
        String trialInput = Console.readLine();
        return TrialsValidator.validateTrial(trialInput);

    }
}