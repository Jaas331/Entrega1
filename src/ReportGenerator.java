import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ReportGenerator {

    public static void generateSalesmenReport(
            ArrayList<Salesman> salesmen) {

        try {

            PrintWriter writer = new PrintWriter(
                    new FileWriter(
                            "salesmen_report.csv"));

            for (Salesman salesman : salesmen) {

                writer.println(
                        salesman.getFullName()
                                + ";"
                                + salesman.getTotalSales());
            }

            writer.close();

            System.out.println(
                    "salesmen_report.csv generated");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // PEGAR EL PASO 2 AQUÍ ↓↓↓

    public static void generateProductsReport(
            ArrayList<ProductReport> products) {

        try {

            PrintWriter writer = new PrintWriter(
                    new FileWriter(
                            "products_report.csv"));

            for (ProductReport product : products) {

                writer.println(
                        product.getProductName()
                                + ";"
                                + product.getProductPrice()
                                + ";"
                                + product.getQuantitySold());
            }

            writer.close();

            System.out.println(
                    "products_report.csv generated");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
