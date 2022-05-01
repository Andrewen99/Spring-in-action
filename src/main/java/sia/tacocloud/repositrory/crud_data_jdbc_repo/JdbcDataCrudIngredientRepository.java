package sia.tacocloud.repositrory.crud_data_jdbc_repo;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.model.Ingredient;

/**
 * Это тот же самый JdbcDataIngredientRepository, {@link sia.tacocloud.repositrory.JdbcDataIngredientRepository}
 */
public interface JdbcDataCrudIngredientRepository extends CrudRepository<Ingredient, String> {
}
