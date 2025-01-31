package racingcar.View;

import java.util.Scanner;

public class TrialInputView implements InputIViewInterface {

    @Override
    public String getInput(Scanner scanner) {
        System.out.println(InputPrompts.TRIAL);
        return scanner.nextLine();

    }

}
