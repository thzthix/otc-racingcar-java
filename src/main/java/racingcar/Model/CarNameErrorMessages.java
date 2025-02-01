package racingcar.Model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum CarNameErrorMessages {
    LENGTH("자동차의 이름은 1자 이상 5자 이하여야 합니다"), DEFAULT_ERROR("유효하지 않은 입력입니다");


    String message;

}
