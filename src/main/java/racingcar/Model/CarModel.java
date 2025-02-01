package racingcar.Model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import camp.nextstep.edu.missionutils.Randoms;
import racingcar.Model.Validation.CarNameValidator;

@ToString
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CarModel implements CarInterface {

    private Integer id;
    final String name;
    int distance = 0;

    public CarModel(Integer id, String name) {
        CarNameValidator.validateCarName(name);
        this.id = id;
        this.name = name;

    }

    public void updateId(Integer id) {
        this.id = id;
    }


    @Override
    public void move() {
        if (canMove()) {
            this.distance += 1;
        }
    }

    @Override
    public boolean canMove() {
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }


}
