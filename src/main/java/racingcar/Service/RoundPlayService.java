package racingcar.Service;

import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import racingcar.Model.CarModel;
import racingcar.Repository.CarRepository;
@RequiredArgsConstructor
public class RoundPlayService {

    private final CarRepository carRepository;

    public void playRound() {
        List<CarModel> currentCars = carRepository.readAll();
        currentCars.forEach(CarModel::move);
        currentCars.forEach(carModel -> carRepository.update(carModel.getId(), carModel));
        currentCars.forEach((car)->System.out.println(car.getDistance()));
    }

    public List<String> determineWinners() {
        List<CarModel> currentCars = carRepository.readAll();
        List<Integer> currentDistance = currentCars.stream().map(CarModel::getDistance).toList();
        int maxDistance = Collections.max(currentDistance);
        return currentCars.stream().filter(car -> car.getDistance() == maxDistance)
            .map(CarModel::getName).toList();

    }

}
