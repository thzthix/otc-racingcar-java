package racingcar.Controller.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import racingcar.Model.CarModel;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class GameRequestDto {
    int trial;
    List<CarModel> cars;
    // 객체 생성할때 정적 팩토리 메서드
    // 생성자보다는 정적 팩토리 메서드 = 모든 클래스에 적용할게아니라 DTO 에만
    public static GameRequestDto of(int trial, String[] carNames) {
        List<CarModel> cars = Arrays.stream(carNames)
                .map(CarModel::new)
                .toList();
        return new GameRequestDto(trial, cars);
    }
}
