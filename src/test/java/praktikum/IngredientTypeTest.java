package praktikum;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class IngredientTypeTest {

        @ParameterizedTest
        @EnumSource(IngredientType.class)
        void enumValuesExist(IngredientType type) {
            assertNotNull(type);
            assertNotNull(type.name());
        }
  
}