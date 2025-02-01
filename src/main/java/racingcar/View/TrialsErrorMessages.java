package racingcar.View;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum TrialsErrorMessages {
    INVALID_COUNT("1이상의 숫자를 입력하세요"), DEFAULT_ERROR("유효하지 않은 입력입니다");
    public String message;
}
