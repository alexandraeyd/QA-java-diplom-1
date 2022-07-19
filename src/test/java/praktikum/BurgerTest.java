package praktikum;


import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

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
    @Mock
     Ingredient ingredient2;
    @Mock
     Ingredient ingredient3;



    @Test
    public void setBunsSetCorrectValue() {
        Burger burger = new Burger();
        burger.setBuns(bun);

        Object actual = burger.bun;
        assertEquals("Bun is not set correctly", bun, actual);
    }

    @Test
    public void addIngredientSetCorrectValue() {
        Burger burger = new Burger();
        burger.addIngredient(ingredient);

        Object actual = burger.ingredients.get(0);
        assertEquals("Ingredient is not added correctly", ingredient, actual);
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
        assertEquals("Ingredient is not removed correctly", ingredientsUpdated, actual);
    }

    @Test
    public void moveIngredientWorks() {
        Burger burger = new Burger();

        burger.ingredients.add(ingredient);
        burger.ingredients.add(ingredient1);
        burger.ingredients.add(ingredient2);
        burger.ingredients.add(ingredient3);


        burger.moveIngredient(1,2);

        List<Ingredient> ingredientsUpdated = new ArrayList<Ingredient>();
        ingredientsUpdated.add(ingredient);
        ingredientsUpdated.add(ingredient2);
        ingredientsUpdated.add(ingredient1);
        ingredientsUpdated.add(ingredient3);

        Object actual = burger.ingredients;
        assertEquals("Ingredient is not moved correctly", ingredientsUpdated, actual);
    }

}
