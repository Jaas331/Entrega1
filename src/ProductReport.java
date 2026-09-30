public class ProductReport {

    private String productName;
    private double productPrice;
    private int quantitySold;

    public ProductReport(
            String productName,
            double productPrice,
            int quantitySold) {

        this.productName = productName;
        this.productPrice = productPrice;
        this.quantitySold = quantitySold;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getQuantitySold() {
        return quantitySold;
    }
}
