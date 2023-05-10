import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class IngredientTest {

    @Mock
    IngredientType ingredientType;

    @Test
    public void ingredientGetNameReturnsName(){
        Ingredient ingredient = new Ingredient(ingredientType, "newIngredient", 2);
        String expectedName = "newIngredient";

        assertEquals("Имя ингридиента не совпадает!", expectedName, ingredient.getName());
    }

    @Test
    public void ingredientGetPriceReturnsPrice(){
        Ingredient ingredient = new Ingredient(ingredientType, "newIngredient", 2);
        float expectedPrice = 2;

        assertEquals("Цена ингридиента не совпадает!", expectedPrice, ingredient.getPrice(), 0);
    }
}
