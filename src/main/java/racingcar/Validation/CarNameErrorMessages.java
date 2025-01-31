package racingcar.Validation;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum CarNameErrorMessages {
    LENGTH("자동차의 이름은 1자 이상 5자 이하여야 합니다"), NO_NAMES_ENTERED(
        "자동차 이름을 1개 이상 입력해주세요"), DUPLICATED("중복된 이름이 없어야 합니다"), DEFAULT_ERROR("유효하지 않은 입력입니다");


    String message;

}
