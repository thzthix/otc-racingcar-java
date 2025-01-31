package racingcar.View;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum InputPrompts {
    NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)"), TRIAL("시도할 횟수는 몇 회인가요?");

    String message;

}
