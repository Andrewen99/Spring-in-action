package sia.tacocloud.repositrory.crud_data_jdbc_repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.model.TacoOrder;

import java.util.List;

/**
 *
 */
public interface JdbcDataCrudOrderRepository extends CrudRepository<TacoOrder, Long> {
    //просто примеры методов

    //Метод, который формируется с помощью spring data
    List<TacoOrder> findByDeliveryZip(String deliveryZip);

    //метод с аннотацией квери - не проверял
    @Query(value = "SELECT * FROM Taco_Order o where o.deliveryCity='Moscow'", nativeQuery = true)
    List<TacoOrder> readOrdersDeliveredInMoscow();
}
