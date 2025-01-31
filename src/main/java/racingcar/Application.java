package racingcar;

import java.util.Scanner;
import racingcar.View.CarNameInputView;
import racingcar.View.TrialInputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        CarNameInputView carName = new CarNameInputView();
        TrialInputView trial = new TrialInputView();
        Scanner scanner = new Scanner(System.in);
        carName.getInput(scanner);
        trial.getInput(scanner);

    }
}
