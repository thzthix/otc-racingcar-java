package racingcar.View;

import camp.nextstep.edu.missionutils.Console;


public class InputView {



    public String getCarNames() {
        System.out.println(InputPrompts.NAME);
        return Console.readLine();

    }

    public String getTrials() {
        System.out.println(InputPrompts.TRIAL);
        return Console.readLine();

    }
}