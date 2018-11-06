package tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {

    private PriceCalculator priceCalculator;

    @Before
    public void setup() {
        priceCalculator = new PriceCalculator();
    }

    @Test
    public void shoud_calculate_price_without_tax() {
        String price = priceCalculator.calculate(3, 1.21, 0);

        assertEquals("3.63 €", price);
    }

    @Test
    public void shoud_calculate_price_with_tax() {
        String price = priceCalculator.calculate(3, 1.21, 5);

        assertEquals("3.81 €", price);
    }

    @Test
    public void shoud_calculate_price_with_tax_20() {
        String price = priceCalculator.calculate(3, 1.21, 20);

        assertEquals("4.36 €", price);
    }
}
