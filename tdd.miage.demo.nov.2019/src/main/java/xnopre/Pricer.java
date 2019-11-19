package xnopre;

public class Pricer {
    public String calculate(int quantity, double unitPrice, int tax) {
        double rawPrice = quantity * unitPrice;
        double priceWithTax = rawPrice * (1 + tax / 100.0);
        double totalPrice = round(priceWithTax);
        return totalPrice +" €";
    }

    private double round(double priceWithTax) {
        return ((int) (priceWithTax * 100 + 0.5)) / 100.0;
    }
}
