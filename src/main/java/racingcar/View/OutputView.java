package racingcar.View;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.Model.CarModel;

public class OutputView {

    public void displayRoundResults(List<CarModel> cars) {
        cars.forEach((car) -> System.out.println(makeRoundResultMessage(car)));
    }
    public String makeRoundResultMessage(CarModel car){
        String movementsSymbols = OutputPrompts.MOVEMENT_SYMBOL.toString().repeat(car.getDistance());
        return String.format("%s %s %s", car.getName(), OutputPrompts.COLON_SEPERATOR, movementsSymbols);
    }
    public void displayWinners(List<String> winners){
        String winnersToString = winners.stream().collect(Collectors.joining(OutputPrompts.WINNER_SEPERATOR.toString()));
        System.out.println(winnersToString);
    }


}
