package xnopre;

public class Pricer {
    public String calculatePrice(int quantity, double unitPrice, int tax) {
        double totalRawPrice = quantity * unitPrice;
        totalRawPrice = applyDiscount(totalRawPrice);
        double totalPriceWithTax = totalRawPrice * (1 + tax / 100.0);
        return round(totalPriceWithTax) + " €";
    }

    private static double applyDiscount(double totalRawPrice) {
        int discountRate = getDiscountRate(totalRawPrice);
        totalRawPrice = totalRawPrice * (1 - discountRate / 100.0);
        return totalRawPrice;
    }

    private static int getDiscountRate(double totalRawPrice) {
        if (totalRawPrice > 5000) {
            return 5;
        }
        if (totalRawPrice > 1000) {
            return 3;
        }
        return 0;
    }

    private static double round(double totalPriceWithTax) {
        return ((int) (totalPriceWithTax * 100 + 0.5)) / 100.0;
    }
}
