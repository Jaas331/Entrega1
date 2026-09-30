public class Sale {

    private int productId;
    private int quantity;

    public Sale(int productId,
            int quantity) {

        this.productId = productId;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }
}