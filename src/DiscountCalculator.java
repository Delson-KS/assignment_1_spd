class DiscountCalculator {
    public double calculateDiscount(Product product) {
        return product.getDiscount();
    }
}


class FoodProduct implements Product{
    public double price;

    public FoodProduct(double price) {
        this.price = price;
    }
    @Override
    public double getDiscount() {
        return price*0.1;
    }
}

class ElectronicsProduct implements Product{
    public double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price*0.05;
    }
}

class clothingProduct implements Product{

    double price;
    clothingProduct(double price){
        this.price=price;
    }
    @Override
    public double getDiscount() {
        return this.price * 0.3;
    }
}
