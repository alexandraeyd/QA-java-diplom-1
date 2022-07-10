package praktikum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BurgerGetPriceTest {

    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;

    @Mock
    Ingredient ingredient1;

    @Test
    public void getPriceReturnsCorrectValue() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);

        Mockito.when(bun.getPrice()).thenReturn((float) 150.5);
        Mockito.when(ingredient.getPrice()).thenReturn((float) 50.8);

        float actual = burger.getPrice();
        float expected = (float) 351.8;
        Mockito.verify(bun).getPrice();
        Mockito.verify(ingredient).getPrice();

        Assert.assertEquals(actual, expected, 0);

    }

    @Test
    public void getPriceReturnsCorrectValueWithFewIngredients() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient1);

        Mockito.when(bun.getPrice()).thenReturn((float) 150.5);
        Mockito.when(ingredient.getPrice()).thenReturn((float) 50.8);
        Mockito.when(ingredient1.getPrice()).thenReturn((float) 22.6);

        float actual = burger.getPrice();
        float expected = (float) 374.4;
        Assert.assertEquals(actual, expected, 0);

    }

    @Test
    public void getPriceReturnsCorrectValueWithoutIngredients() {
        Burger burger = new Burger();
        burger.setBuns(bun);

        Mockito.when(bun.getPrice()).thenReturn((float) 150.5);

        float actual = burger.getPrice();
        float expected = (float) 301;
        Assert.assertEquals(actual, expected, 0);



    }
}
