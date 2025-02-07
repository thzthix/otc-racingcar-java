package racingcar.Controller.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import racingcar.Model.CarModel;

import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class GameResponseDto {
    List<String> winners;
    List<CarModel> cars;

    public static GameResponseDto of(List<String> winners, List<CarModel> cars) {
        return new GameResponseDto(winners, cars);
    }
}
