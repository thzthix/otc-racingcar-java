package racingcar.View;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.Model.CarModel;

public class OutputView {

    public void printRoundResultsHeader() {
        System.out.println(OutputPrompts.ROUND_RESULT.getMessage());

    }

    public void printRoundResults(List<CarModel> cars) {
        cars.forEach((car) -> System.out.println(makeRoundResultMessage(car)));
        System.out.println();
    }

    public String makeRoundResultMessage(CarModel car) {
        String movementsSymbols = OutputPrompts.MOVEMENT_SYMBOL.getMessage()
            .repeat(car.getDistance());
        return String.format("%s %s %s", car.getName(), OutputPrompts.COLON_SEPERATOR.getMessage(),
            movementsSymbols);
    }

    public String makeWinnerResultMessage(List<String> winners) {
        String winnersToString = winners.stream()
            .collect(Collectors.joining(OutputPrompts.WINNER_SEPERATOR.getMessage()));
        return String.format("%s %s", OutputPrompts.WINNER.getMessage(), winnersToString);
    }

    public void displayWinners(List<String> winners) {
        String winnerResultMessage = makeWinnerResultMessage(winners);
        System.out.println(winnerResultMessage);
    }


}
