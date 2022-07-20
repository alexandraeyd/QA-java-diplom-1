package praktikum;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;
import org.junit.Test;

@RunWith(Parameterized.class)
public class BurgerGetPriceTest {

    private float[] ingredientsPrices;
    private float bunPrice;
    private float expected;


    public BurgerGetPriceTest(float bunPrice, float[] ingredientsPrices, float expected) {
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
                {200.5f, new float[]{21.6f, 47.9f, 30f, 111f}, 611.5f},
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


        float actual = (float)burger.getPrice();
        Assert.assertEquals( "Get price returned incorrect value", expected, actual,0);

    }
}
