package racingcar.Repository;

import java.util.HashMap;
import java.util.Map;
import racingcar.Model.CarModel;

public abstract class AbstractRepository<T extends CarModel, ID> implements
    RepositoryInterface<T, ID> {

    Integer currentId = 0;
    protected Map<ID, T> dataMap = new HashMap<>();

    Integer IdGenerator() {
        return currentId += 1;
    }
}
