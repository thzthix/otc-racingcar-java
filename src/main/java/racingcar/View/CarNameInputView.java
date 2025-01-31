package racingcar.View;

import java.util.Scanner;

public class CarNameInputView implements InputIViewInterface {

    @Override
    public String getInput(Scanner scanner) {
        System.out.println(InputPrompts.NAME);
        return scanner.nextLine();

    }

}
