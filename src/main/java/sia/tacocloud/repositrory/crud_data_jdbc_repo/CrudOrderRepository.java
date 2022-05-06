package sia.tacocloud.repositrory.crud_data_jdbc_repo;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.model.TacoOrder;

import java.util.List;
import java.util.UUID;

/**
 *
 */
public interface CrudOrderRepository extends CrudRepository<TacoOrder, UUID> {

}
