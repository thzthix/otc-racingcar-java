package racingcar.Validation;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum TrialsErrorMessages {
    INVALID_COUNT("시도 횟수는 1 이상이어야 합니다"), DEFAULT_ERROR("유효하지 않은 입력입니다");
    public String message;
}
