package racingcar.Model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import camp.nextstep.edu.missionutils.Randoms;

@Getter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CarModel implements CarInterface {

    final String id;
    final String name;
    int distance = 0;

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
