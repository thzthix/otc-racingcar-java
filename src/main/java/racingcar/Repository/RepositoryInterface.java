package racingcar.Repository;

import java.util.List;
import racingcar.Model.CarModel;

public interface RepositoryInterface<T extends CarModel, ID> {

    T create(T entity);

    T read(ID id);

    T update(ID id, T entity);

    List<T> readAll();


}
