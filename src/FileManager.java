import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileManager {

    public static ArrayList<Product> readProducts() {

        ArrayList<Product> products = new ArrayList<>();

        try {

            BufferedReader reader = new BufferedReader(
                    new FileReader("products.txt"));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(";");

                int id = Integer.parseInt(data[0]);

                String name = data[1];

                double price = Double.parseDouble(data[2]);

                products.add(
                        new Product(
                                id,
                                name,
                                price));
            }

            reader.close();

        } catch (Exception e) {

            System.out.println(
                    "Error reading products file.");

            e.printStackTrace();
        }

        return products;
    }

    public static ArrayList<Salesman> readSalesmen() {

        ArrayList<Salesman> salesmen = new ArrayList<>();

        try {

            BufferedReader reader = new BufferedReader(
                    new FileReader(
                            "salesmen_info.txt"));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(";");

                String documentType = data[0];

                long documentNumber = Long.parseLong(data[1]);

                String firstName = data[2];

                String lastName = data[3];

                salesmen.add(
                        new Salesman(
                                documentType,
                                documentNumber,
                                firstName,
                                lastName));
            }

            reader.close();

        } catch (Exception e) {

            System.out.println(
                    "Error reading salesmen file.");

            e.printStackTrace();
        }

        return salesmen;
    }

    public static ArrayList<Sale> readSalesFile(
            String fileName) {

        ArrayList<Sale> sales = new ArrayList<>();

        try {

            BufferedReader reader = new BufferedReader(
                    new FileReader(fileName));

            String line;

            // Saltar primera línea
            reader.readLine();

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(";");

                int productId = Integer.parseInt(data[0]);

                int quantity = Integer.parseInt(data[1]);

                sales.add(
                        new Sale(
                                productId,
                                quantity));
            }

            reader.close();

        } catch (Exception e) {

            System.out.println(
                    "Error reading sales file.");

            e.printStackTrace();
        }

        return sales;
    }

    public static Product findProductById(
            ArrayList<Product> products,
            int productId) {

        for (Product product : products) {

            if (product.getId() == productId) {
                return product;
            }
        }

        return null;
    }
}