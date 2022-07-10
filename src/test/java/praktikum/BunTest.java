package praktikum;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class BunTest {


    @Test
    public void getNameReturnsCorrectValue() {
        String bunName = "SomeName";

        Bun bun = new Bun (bunName, 1);
        String actual = bun.getName();
        String expected = bunName;
        assertEquals(expected, actual);
    }

    @Test
    public void getPriceReturnsCorrectValue() {
        float bunPrice = 100;

        Bun bun = new Bun ("Name", bunPrice);
        float actual = bun.getPrice();
        float expected = bunPrice;
        assertEquals(expected, actual,0);
    }
}
