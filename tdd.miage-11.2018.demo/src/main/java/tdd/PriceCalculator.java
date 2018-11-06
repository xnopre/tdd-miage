package tdd;

public class PriceCalculator {
    public String calculate(int quantity, double unitPrice, double tax) {
        double totalPrice = quantity * unitPrice;
        double totalPriceWithTax = totalPrice * (1.0 + tax / 100);
        return round(totalPriceWithTax) +" €";
    }

    private double round(double totalPriceWithTax) {
        return ((int)(totalPriceWithTax * 100 + 0.5))/100.0;
    }
}
