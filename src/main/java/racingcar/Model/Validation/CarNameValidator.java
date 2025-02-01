package racingcar.Model.Validation;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class CarNameValidator {

    static final int MAX_NAME_LENGTH = 5;

    private static boolean isCarNameLengthValid(String name) {
        return !name.isEmpty() && name.length() <= MAX_NAME_LENGTH;
    }

    public static void validateCarName(String name) {
        if (!isCarNameLengthValid(name)) {
            throw new IllegalArgumentException(CarNameErrorMessages.LENGTH.getMessage());
        }
    }
}
