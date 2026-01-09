package praktikum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class IngredientTest {

    @ParameterizedTest
    @EnumSource(IngredientType.class)
    void ingredientFieldsAreReturnedCorrectly(IngredientType type) {
        Ingredient ingredient = new Ingredient(type, "Test ingredient", 50.0f);

        assertEquals(type, ingredient.getType());
        assertEquals("Test ingredient", ingredient.getName());
        assertEquals(50.0f, ingredient.getPrice());
    }
}