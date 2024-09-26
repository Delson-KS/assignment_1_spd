public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        Product food = new FoodProduct(500);
        Product hoodie = new clothingProduct(20000);
        Product laptop = new ElectronicsProduct(160000);

        System.out.println("food "+discountCalculator.calculateDiscount(food));
        System.out.println("cloth "+discountCalculator.calculateDiscount(hoodie));
        System.out.println("electronics: "+discountCalculator.calculateDiscount(laptop));
    }
}