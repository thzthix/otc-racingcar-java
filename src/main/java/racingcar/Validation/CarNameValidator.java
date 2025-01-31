package racingcar.Validation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class CarNameValidator extends ValidatorAbstractClass {

    private final Set<String> nameSet = new HashSet<>();
    static final int MAX_NAME_LENGTH = 5;


    private void validateCarNamesLength(List<String> carNames) {
        carNames.forEach(name -> {
            if (!isCarNameLengthValid(name)) {
                throwValidationError(CarNameErrorMessages.LENGTH.getMessage());
            }
        });

    }

    private boolean isCarNameLengthValid(String name) {
        return name.length() <= MAX_NAME_LENGTH && !name.isEmpty();
    }

    private boolean isCarNameEmpty(List<String> carNames) {
        return carNames.size() == 1 && carNames.get(0).isEmpty();
    }

    private boolean isCarNamesAreUnique(List<String> carNames) {
        nameSet.addAll(carNames);
        return carNames.size() == nameSet.size();

    }


    public void validateCarName(List<String> carNames) {
        if (isCarNameEmpty(carNames)) {
            throwValidationError(CarNameErrorMessages.NO_NAMES_ENTERED.getMessage());
        }

        validateCarNamesLength(carNames);
        if (!isCarNamesAreUnique(carNames)) {
            throwValidationError(CarNameErrorMessages.DUPLICATED.getMessage());
        }


    }
}
