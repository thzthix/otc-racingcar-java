package racingcar.Repository;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import lombok.NoArgsConstructor;
import racingcar.Model.CarModel;

@NoArgsConstructor
public class CarRepository extends Abstractrepository<CarModel, Integer> {

    public CarRepository(String[] carNames) {
        Arrays.stream(carNames).forEach((carName) -> create(new CarModel(null, carName)));
        System.out.println("values" + dataMap.values());

    }

    @Override
    public CarModel create(CarModel car) {
        Integer id = IdGenerator();
        car.updateId(id);
        dataMap.put(id, car);
        return dataMap.get(id);

    }

    @Override
    public CarModel read(Integer id) {
        return Optional.ofNullable(dataMap.get(id))
            .orElseThrow(() -> new RuntimeException("존재하지 않는 아이디입니다"));
    }

    @Override
    public CarModel update(Integer id, CarModel car) {
        CarModel carToUpdate = read(id);
        dataMap.replace(id, car);
        return dataMap.get(id);
    }

    @Override
    public List<CarModel> readAll() {
        return dataMap.values().stream().toList();
    }
}
