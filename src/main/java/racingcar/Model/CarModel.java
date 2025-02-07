package racingcar.Model;

import camp.nextstep.edu.missionutils.Randoms;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import racingcar.Model.Validation.CarNameValidator;

@ToString
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CarModel implements CarInterface {

    private Integer id;
    final String name;
    int distance = 0;
    static final int MIN_NUMBER = 0;
    static final int MAX_NUMBER = 9;
    static final int THRESHOLD = 4;
    static final int MOVE_DISTANCE = 1;

    // 유저 ID 처럼 쓰고싶다면 자동증가로 하세요. 굳이 비지니스 요구사항에 없었으니 지워도됩니다.
    public CarModel(String name) {
        CarNameValidator.validateCarName(name);
//        this.id = id;
        this.name = name;

    }

    public void updateId(Integer id) {
        this.id = id;
    }

    @Override
    public void move() {
        if (canMove()) {
            this.distance += MOVE_DISTANCE;
        }
    }

    @Override
    public boolean canMove() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER) >= THRESHOLD;
    }
}
