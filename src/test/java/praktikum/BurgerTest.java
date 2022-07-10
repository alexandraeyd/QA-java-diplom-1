package praktikum;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {


    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;

     @Mock
     Ingredient ingredient1;
     Ingredient ingredient2;
     Ingredient ingredient3;



    @Test
    public void setBunsSetCorrectValue() {
        Burger burger = new Burger();
        burger.setBuns(bun);

        Object actual = burger.bun;
        Object expected = bun;
        assertEquals(expected, actual);
    }

    @Test
    public void addIngredientSetCorrectValue() {
        Burger burger = new Burger();
        burger.addIngredient(ingredient);

        Object actual = burger.ingredients.get(0);
        Object expected = ingredient;
        assertEquals(expected, actual);
    }

    @Test
    public void removeIngredientWorks() {
        Burger burger = new Burger();
        List<Ingredient> ingredients = new ArrayList<Ingredient>();
        ingredients.add(ingredient);
        ingredients.add(ingredient1);
        burger.ingredients = ingredients;

        burger.removeIngredient(1);

        List<Ingredient> ingredientsUpdated = new ArrayList<Ingredient>();
        ingredientsUpdated.add(ingredient);

        Object actual = burger.ingredients;
        Object expected = ingredientsUpdated;
        assertEquals(expected, actual);
    }

    @Test
    public void moveIngredientWorks() {
        Burger burger = new Burger();
        List<Ingredient> ingredients = new ArrayList<Ingredient>();
        ingredients.add(ingredient);
        ingredients.add(ingredient1);
        ingredients.add(ingredient2);
        ingredients.add(ingredient3);
        burger.ingredients = ingredients;

        burger.moveIngredient(1,2);

        List<Ingredient> ingredientsUpdated = new ArrayList<Ingredient>();
        ingredientsUpdated.add(ingredient);
        ingredientsUpdated.add(ingredient2);
        ingredientsUpdated.add(ingredient1);
        ingredientsUpdated.add(ingredient3);

        Object actual = burger.ingredients;
        Object expected = ingredientsUpdated;
        assertEquals(expected, actual);
    }

}
