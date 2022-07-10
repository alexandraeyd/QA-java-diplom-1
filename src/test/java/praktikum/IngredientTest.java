package praktikum;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IngredientTest {

    @Test
    public void getPriceReturnsCorrectValue() {
        float ingredientPrice = 200;
        String ingredientName = "SomeIngredient";
        IngredientType ingredientType = IngredientType.SAUCE;

        Ingredient ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
        float actual = ingredient.getPrice();
        float expected = ingredientPrice;
        assertEquals(expected, actual,0);
    }

    @Test
    public void getNameReturnsCorrectValue() {
        String ingredientName = "SomeIngredient";
        float ingredientPrice = 100;
        IngredientType ingredientType = IngredientType.SAUCE;

        Ingredient ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
        String actual = ingredient.getName();
        String expected = ingredientName;
        assertEquals(expected, actual);
    }

    @Test
    public void getTypeReturnsCorrectValue() {
        String ingredientName = "SomeIngredient";
        float ingredientPrice = 100;
        IngredientType ingredientType = IngredientType.SAUCE;

        Ingredient ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
        IngredientType actual = ingredient.getType();
        IngredientType expected = ingredientType;
        assertEquals(expected, actual);
    }
}
