package sia.tacocloud.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import sia.tacocloud.model.Ingredient;
import sia.tacocloud.model.User;
import sia.tacocloud.repositrory.crud_data_jdbc_repo.CrudIngredientRepository;
import sia.tacocloud.repositrory.crud_data_jdbc_repo.UserRepository;

@Configuration
public class DbConfig {

    @Bean
    public CommandLineRunner dataLoader(CrudIngredientRepository ingredientRepo, UserRepository userRepo, PasswordEncoder encoder) {
        return args -> {
            ingredientRepo.deleteAll(); // TODO: Quick hack to avoid tests from stepping on each other with constraint violations
            ingredientRepo.save(new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP));
            ingredientRepo.save(new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP));
            ingredientRepo.save(new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN));
            ingredientRepo.save(new Ingredient("CARN", "Carnitas", Ingredient.Type.PROTEIN));
            ingredientRepo.save(new Ingredient("TOFU", "Vegan Tofu", Ingredient.Type.PROTEIN));
            ingredientRepo.save(new Ingredient("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIES));
            ingredientRepo.save(new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIES));
            ingredientRepo.save(new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE));
            ingredientRepo.save(new Ingredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE));
            ingredientRepo.save(new Ingredient("SLSA", "Salsa", Ingredient.Type.SAUCE));
            ingredientRepo.save(new Ingredient("SRCR", "Sour Cream", Ingredient.Type.SAUCE));

            userRepo.save(new User("user",
                                   encoder.encode("user"),
                                   "User userovich",
                                   "user_street",
                                   "User_City",
                                   "User_State",
                                   "235901",
                                   "799999999989"));
        };
    }
}
