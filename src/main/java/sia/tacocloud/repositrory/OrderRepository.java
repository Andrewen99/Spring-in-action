package sia.tacocloud.repositrory;

import sia.tacocloud.model.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);

}
