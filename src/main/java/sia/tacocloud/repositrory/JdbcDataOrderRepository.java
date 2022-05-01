package sia.tacocloud.repositrory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.Repository;
import sia.tacocloud.model.Ingredient;
import sia.tacocloud.model.TacoOrder;

import java.util.Optional;

/**
 * Имплеминтация взаимодействия с БД через Spring Data JDBC. Этот вариант использует прямое наследование от Repository
 * Если в бд типичные запросы то можно имплементиться от CrudRepository
 */
@Qualifier("jdbcDataRepo")
@Primary
public interface JdbcDataOrderRepository extends OrderRepository, Repository<TacoOrder, String> {
    Iterable<TacoOrder> findAll();

    Optional<TacoOrder> findById(String id);

    TacoOrder save(TacoOrder order);
}
