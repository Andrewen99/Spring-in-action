package sia.tacocloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import sia.tacocloud.model.Ingredient;
import sia.tacocloud.model.IngredientUDT;
import sia.tacocloud.repositrory.crud_data_jdbc_repo.CrudIngredientRepository;

@Component
public class IngredientUDTByIdConverter implements Converter<String, IngredientUDT> {
    private final CrudIngredientRepository ingredientRepo;

    @Autowired
    public IngredientUDTByIdConverter(CrudIngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public IngredientUDT convert(String id) {
        Ingredient ingredient = ingredientRepo.findById(id).orElse(null);
        return new IngredientUDT(ingredient.getName(), ingredient.getType());

    }
}
