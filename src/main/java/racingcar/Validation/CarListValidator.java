package racingcar.Validation;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CarListValidator extends ValidatorAbstractClass{

    private final String[] carNames;
    private boolean isCarNamesEmpty(){
        return carNames.length == 0;
    }
    private boolean namesAreUnique() {
        Set<String> carNameSet = new HashSet<>(List.of(carNames));
        return carNameSet.size() == carNames.length;

    }
    public void validateCarNames(){
        if(isCarNamesEmpty()){
            throwValidationError(CarListErrorMessages.CAR_NAME_NOT_PROVIDED.getMessage());
        }
        if(!namesAreUnique()){
            throwValidationError(CarListErrorMessages.DUPLICATED.getMessage());
        }

    }


}
