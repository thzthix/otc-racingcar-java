package racingcar.View.Validation;

public class TrialsValidator {

    private static int isNumber(String input) {

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(TrialsErrorMessages.INVALID_COUNT.getMessage());
        }
    }

    private static boolean isPositive(int trial) {
        return trial > 0;
    }

    public static int validateTrial(String input) {
        int parsedInput = isNumber(input);
        if (!isPositive(parsedInput)) {
            throw new IllegalArgumentException(TrialsErrorMessages.INVALID_COUNT.getMessage());
        }
        return parsedInput;
    }


}
