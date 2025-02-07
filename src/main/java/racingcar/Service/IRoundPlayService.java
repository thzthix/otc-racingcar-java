package racingcar.Service;

import racingcar.Model.CarModel;
import racingcar.Repository.CarRepository;

import java.util.Collections;
import java.util.List;

public interface IRoundPlayService {
    public List<CarModel> getCurrentCars();
    public void playRound();
    public List<String> determineWinners();
}
