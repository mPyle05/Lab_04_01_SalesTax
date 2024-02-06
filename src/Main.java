public class Main {
    public static void main(String[] args) {
        double purchasePrice = 100.0;
        double salesTaxRate = 0.05; // 5%

        double salesTax = purchasePrice * salesTaxRate;
        double totalPrice = purchasePrice + salesTax;

        System.out.println("Purchase Price: $" + purchasePrice);
        System.out.println("Sales Tax (5%): $" + salesTax);
        System.out.println("Total Price: $" + totalPrice);
    }
}
