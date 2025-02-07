package racingcar.View;

import camp.nextstep.edu.missionutils.Console;
import racingcar.View.Validation.CarListValidator;

public interface IInputView {
    String[] getCarNames();
    int getTrials();
}
