package racingcar.View;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public enum OutputPrompts {
    MOVEMENT_SYMBOL("-"),
    COLON_SEPERATOR(":"),
    ROUND_RESULT("실행 결과"),
    WINNER("최종 우승자 :"),
    WINNER_SEPERATOR(",");

    String message;
}
