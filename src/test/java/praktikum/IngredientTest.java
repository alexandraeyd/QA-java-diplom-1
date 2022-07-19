package praktikum;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IngredientTest {

    @Test
    public void getPriceReturnsCorrectValue() {
        float ingredientPrice = 200f;
        String ingredientName = "SomeIngredient";
        IngredientType ingredientType = IngredientType.SAUCE;

        Ingredient ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
        float actual = ingredient.getPrice();
        assertEquals(ingredientPrice, actual,0);
    }

    @Test
    public void getNameReturnsCorrectValue() {
        String ingredientName = "SomeIngredient";
        float ingredientPrice = 100;
        IngredientType ingredientType = IngredientType.SAUCE;

        Ingredient ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
        String actual = ingredient.getName();
        assertEquals(ingredientName, actual);
    }

    @Test
    public void getTypeReturnsCorrectValue() {
        String ingredientName = "SomeIngredient";
        float ingredientPrice = 100f;
        IngredientType ingredientType = IngredientType.SAUCE;

        Ingredient ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
        IngredientType actual = ingredient.getType();
        assertEquals(ingredientType, actual);
    }
}
