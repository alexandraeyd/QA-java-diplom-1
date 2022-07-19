package praktikum;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.lang.reflect.Array;
import java.util.List;

@RunWith(Parameterized.class)
public class BurgerGetPriceWithFewIngredientsTest {

    private float[] ingredientsPrices;
    private float bunPrice;
    private float expected;


    public BurgerGetPriceWithFewIngredientsTest(float bunPrice, float[] ingredientsPrices, float expected) {
        this.bunPrice = bunPrice;
        this.ingredientsPrices = ingredientsPrices;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {150f, new float[]{10f, 20f}, 330f},
                {100f, new float[]{10f, 20f,21f}, 251f},
                {100f, new float[]{}, 200f},
                {0f, new float[]{0f}, 0f},
        };
    }

    @Test
    public void getPriceReturnsCorrectValueWithFewIngredients() {
        Burger burger = new Burger();
        Bun bun = new Bun("bun", bunPrice);
        burger.setBuns(bun);

        for (int i=0; i<ingredientsPrices.length; i++) {
            Ingredient ingredient = new Ingredient(IngredientType.FILLING, ("ingredient"+Integer.toString(i)), ingredientsPrices[i]);
            burger.addIngredient(ingredient);
        }


        float actual = burger.getPrice();
        Assert.assertEquals( expected, actual,0);

    }
}
