package racingcar.Service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import racingcar.Model.CarModel;
import racingcar.Repository.CarRepository;

@RequiredArgsConstructor
public class RoundPlayService {

    CarRepository carRepository = new CarRepository();

    private final int trials;

    public void playRound() {
        List<CarModel> currentCars = carRepository.readAll();
        currentCars.forEach(CarModel::move);
    }


}
