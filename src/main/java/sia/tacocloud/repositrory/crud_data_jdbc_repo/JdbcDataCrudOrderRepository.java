package sia.tacocloud.repositrory.crud_data_jdbc_repo;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.model.TacoOrder;

/**
 * Тот же самый {@link sia.tacocloud.repositrory.JdbcDataOrderRepository}
 */
public interface JdbcDataCrudOrderRepository extends CrudRepository<TacoOrder, String> {
}
