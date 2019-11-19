package xnopre;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PricerTest {

    Pricer pricer = new Pricer();

    @Test
    public void should_return_price_without_tax() {
        String price = pricer.calculate(3, 1.21, 0);
        assertEquals("3.63 €", price);
    }

    @Test
    public void should_return_price_with_tax() {
        String price = pricer.calculate(3, 1.21, 5);
        assertEquals("3.81 €", price);
    }

    @Test
    public void should_return_price_with_tax_20() {
        String price = pricer.calculate(3, 1.21, 20);
        assertEquals("4.36 €", price);
    }
}
