package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BurgerGetReceiptTest {

    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;


    @Test
    public void getReceiptReturnsCorrectValue() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);

        Mockito.when(bun.getName()).thenReturn("Вкусная булочка");
        Mockito.when(ingredient.getName()).thenReturn("Сыр");
        Mockito.when(bun.getPrice()).thenReturn(140f);
        Mockito.when(ingredient.getPrice()).thenReturn(99f);
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.FILLING);


        String actual = burger.getReceipt();
        String expected = "(==== Вкусная булочка ====)\n" +
                "= filling Сыр =\n" +
                "(==== Вкусная булочка ====)\n" +
                "\n" +
                "Price: 379.000000\n";

        Assert.assertEquals("Receipt is not correct", expected, actual);

    }
}


