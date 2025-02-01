package racingcar.View.Validation;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum CarListErrorMessages {
    DUPLICATED("중복된 이름이 없어야 합니다"),CAR_NAME_NOT_PROVIDED("1개 이상의 이름을 입력해주세요"),HAS_EMPTY_NAME("빈 이름이 없어야 합니다");
    String message;
}
