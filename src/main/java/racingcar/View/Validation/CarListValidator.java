package racingcar.View.Validation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CarListValidator {

    private static boolean isCarNamesEmpty(String[] carNames) {
        return carNames.length == 0;
    }

    private static boolean namesAreUnique(String[] carNames) {
        Set<String> carNameSet = new HashSet<>(List.of(carNames));
        return carNameSet.size() == carNames.length;

    }

    public static void validateCarNames(String[] carNames) {
        if (isCarNamesEmpty(carNames)) {
            throw new IllegalArgumentException(
                CarListErrorMessages.CAR_NAME_NOT_PROVIDED.getMessage());
        }
        if (!namesAreUnique(carNames)) {
            throw new IllegalArgumentException(CarListErrorMessages.DUPLICATED.getMessage());
        }

    }


}
