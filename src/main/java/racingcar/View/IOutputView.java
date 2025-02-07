package racingcar.View;

import racingcar.Model.CarModel;

import java.util.List;

public interface IOutputView {
    void printRoundResultsHeader();
    void printRoundResults(List<CarModel> cars);
    void printWinners(List<String> winners);
}
