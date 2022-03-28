import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void beforeEach() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.volume);
    }

    @Test
    public void hasDrink() {
        waterBottle.drink();
        assertEquals(90, waterBottle.volume);
    }

    @Test
    public void hasEmpty() {
        waterBottle.empty();
        assertEquals(0, waterBottle.volume);
    }

    @Test
    public void hasFill() {
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.volume);
    }

}
