package sia.tacocloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import sia.tacocloud.model.Ingredient;
import sia.tacocloud.repositrory.crud_data_jdbc_repo.CrudIngredientRepository;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {
    private final CrudIngredientRepository ingredientRepo;

    @Autowired
    public IngredientByIdConverter(CrudIngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(id).orElse(null);
    }
}
