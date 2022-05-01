package sia.tacocloud.repositrory;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.Repository;
import sia.tacocloud.model.Ingredient;

import java.util.Optional;

/**
 * Имплеминтация взаимодействия с БД через Spring Data JDBC. Этот вариант использует прямое наследование от Repository
 * Если в бд типичные запросы то можно имплементиться от CrudRepository
 */
@Qualifier("jdbcDataRepo")
@Primary
public interface JdbcDataIngredientRepository extends IngredientRepository, Repository<Ingredient, String> {
    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
