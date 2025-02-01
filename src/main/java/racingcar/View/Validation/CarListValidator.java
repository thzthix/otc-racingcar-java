package racingcar.View.Validation;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import racingcar.View.InputPrompts;

@RequiredArgsConstructor
public class CarListValidator {

    private static final String delimiter = InputPrompts.DELIMITER.getMessage();

    private static boolean isCarNamesEmpty(String carNames) {
        return carNames.isEmpty();
    }

    private static boolean hasEmptyName(String carNames,String[] splitCarNames) {

        int numberOfDelimiter = carNames.length() - carNames.replace(delimiter, "").length();
        return splitCarNames.length != numberOfDelimiter + 1;
    }

    private static boolean namesAreUnique(String[] carNames) {

        Set<String> carNamesSet = new HashSet<>(List.of(carNames));
        return carNamesSet.size() == carNames.length;

    }

    public static void validateCarNames(String carNames) {
        if (isCarNamesEmpty(carNames)) {
            throw new IllegalArgumentException(
                CarListErrorMessages.CAR_NAME_NOT_PROVIDED.getMessage());
        }
        String[] splitCarNames = carNames.split(delimiter);
        if (hasEmptyName(carNames,splitCarNames)) {
            throw new IllegalArgumentException(CarListErrorMessages.HAS_EMPTY_NAME.getMessage());
        }
        if (!namesAreUnique(splitCarNames)) {
            throw new IllegalArgumentException(CarListErrorMessages.DUPLICATED.getMessage());
        }

    }


}
