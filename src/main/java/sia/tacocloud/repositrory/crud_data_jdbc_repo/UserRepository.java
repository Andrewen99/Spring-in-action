package sia.tacocloud.repositrory.crud_data_jdbc_repo;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
