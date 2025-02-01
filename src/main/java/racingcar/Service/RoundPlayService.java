package racingcar.Service;

import java.util.Collections;
import java.util.List;
import racingcar.Model.CarModel;
import racingcar.Repository.CarRepository;

public class RoundPlayService {

    private CarRepository carRepository ;
    public void initiateRepository(String[] carNames){
        this.carRepository = new CarRepository(carNames);
    }

    public void playRound() {
        List<CarModel> currentCars = carRepository.readAll();
        currentCars.forEach(CarModel::move);
        currentCars.forEach(car -> carRepository.update(car.getId(), car));
    }

    public List<String> determineWinners() {
        List<CarModel> currentCars = carRepository.readAll();
        List<Integer> currentDistance = currentCars.stream().map(CarModel::getDistance).toList();
        int maxDistance = Collections.max(currentDistance);
        return currentCars.stream().filter(car -> car.getDistance() == maxDistance)
            .map(CarModel::getName).toList();

    }

}
