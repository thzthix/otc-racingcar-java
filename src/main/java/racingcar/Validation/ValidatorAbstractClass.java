package racingcar.Validation;

public abstract class ValidatorAbstractClass {
    protected void throwValidationError(String message){
        throw new IllegalArgumentException(message);
    }
}
