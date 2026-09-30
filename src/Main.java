import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ArrayList<Product> products = FileManager.readProducts();

        ArrayList<Salesman> salesmen = FileManager.readSalesmen();

        Map<Integer, Integer> productsSold = new HashMap<>();

        for (Salesman salesman : salesmen) {

            String fileName = "salesman_"
                    + salesman.getDocumentNumber()
                    + ".txt";

            ArrayList<Sale> sales = FileManager.readSalesFile(
                    fileName);

            double totalSales = 0;

            for (Sale sale : sales) {

                Product product = FileManager.findProductById(
                        products,
                        sale.getProductId());

                if (product != null) {

                    totalSales += product.getPrice()
                            * sale.getQuantity();

                    int current = productsSold.getOrDefault(
                            sale.getProductId(),
                            0);

                    productsSold.put(
                            sale.getProductId(),
                            current
                                    + sale.getQuantity());
                }
            }

            salesman.addSales(totalSales);
        }

        salesmen.sort((s1, s2) -> Double.compare(
                s2.getTotalSales(),
                s1.getTotalSales()));

        System.out.println();
        System.out.println("SALES REPORT");
        System.out.println();

        for (Salesman salesman : salesmen) {

            System.out.println(
                    salesman.getFullName()
                            + " -> "
                            + salesman.getTotalSales());
        }

        ReportGenerator.generateSalesmenReport(
                salesmen);

        ArrayList<ProductReport> productReports = new ArrayList<>();

        for (Product product : products) {

            int quantitySold = productsSold.getOrDefault(
                    product.getId(),
                    0);

            productReports.add(
                    new ProductReport(
                            product.getName(),
                            product.getPrice(),
                            quantitySold));
        }

        productReports.sort((p1, p2) -> Integer.compare(
                p2.getQuantitySold(),
                p1.getQuantitySold()));

        ReportGenerator.generateProductsReport(
                productReports);

        System.out.println();
        System.out.println("Process finished successfully.");
    }
}