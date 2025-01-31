package racingcar.Validation;

public class TrialsValidator extends ValidatorAbstractClass {

    private int isNumber(String input) {

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throwValidationError(TrialsErrorMessages.INVALID_COUNT.getMessage());
        }
        return 0;


    }

    private boolean isPositive(int trial) {
        return trial > 0;

    }

    public int validateTrial(String input) {
        int parsedInput = isNumber(input);
        if (!isPositive(parsedInput)) {
            throwValidationError(TrialsErrorMessages.INVALID_COUNT.getMessage());
        }
        return parsedInput;
    }


}
