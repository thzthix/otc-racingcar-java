package racingcar.Service;

import java.util.Collections;
import java.util.List;
import racingcar.Model.CarModel;
import racingcar.Repository.CarRepository;

public class RoundPlayService implements IRoundPlayService {

    private CarRepository carRepository;

    // Static 으로 만들게아니라면 초기화 로직은 모두 다 생성자로 대체하세요 (constructor)
    // 객체의 완전성 = 객체를 만들자마자(new) 그 내부에 갖고있는 메서드를 호출할 수 있어야함
    // - 객체를 만들고(new) 어떤 추가적인 상태나 값을 추가한다음(setter) 메서르를 호출해야한다면
    // - 특정 메서드를 호출하기 위해서 선행되어야하는 setter 등의 "암묵적인" 룰이 존재함
    // -> 불완전한 객체사용 혹은 메서드 호출이 발생가능 = 버그
//    public void initiateRepository(String[] carNames) {
//        this.carRepository = new CarRepository(carNames);
//    }

    public RoundPlayService(String[] carNames) {
        this.carRepository = new CarRepository(carNames);
    }

    public List<CarModel> getCurrentCars() {
        return carRepository.readAll();
    }

    public void playRound() {
        List<CarModel> currentCars = getCurrentCars();
//        currentCars.forEach(CarModel::move);
//        currentCars.forEach(car -> carRepository.update(car.getId(), car));
        currentCars.forEach((currentCar) -> {
            currentCar.move();
            carRepository.update(currentCar.getId(), currentCar);
        });
    }

    public List<String> determineWinners() {
        List<CarModel> currentCars = getCurrentCars();
        List<Integer> currentDistance = currentCars.stream().map(CarModel::getDistance).toList();
        int maxDistance = Collections.max(currentDistance);
        return currentCars.stream().filter(car -> car.getDistance() == maxDistance)
            .map(CarModel::getName).toList();

    }

}
