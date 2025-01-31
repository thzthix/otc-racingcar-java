package racingcar.Validation;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class CarNameValidator extends ValidatorAbstractClass {

    static final int MAX_NAME_LENGTH = 5;


    private boolean isCarNameLengthValid(String name) {
        System.out.println("length" + name.length());
        return !name.isEmpty() && name.length() <= MAX_NAME_LENGTH;
    }


    public void validateCarName(String name) {

        System.out.println("loading");
        if (!isCarNameLengthValid(name)) {
            throwValidationError(CarNameErrorMessages.LENGTH.getMessage());
        }


    }
}
