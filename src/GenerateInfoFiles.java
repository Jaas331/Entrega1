import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Generates sample files for the Programming Fundamentals project.
 *
 * @author Johan Arley Abello Sanchez
 */
public class GenerateInfoFiles {

    /**
     * Random object used to generate pseudo-random values.
     */
    private static final Random RANDOM = new Random();

    /**
     * Total number of products to generate.
     */
    private static final int PRODUCTS_COUNT = 20;

    /**
     * Total number of salesmen to generate.
     */
    private static final int SALESMEN_COUNT = 5;

    /**
     * Main method.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {

        try {

            createProductsFile(PRODUCTS_COUNT);

            createSalesManInfoFile(SALESMEN_COUNT);

            for (int i = 1; i <= SALESMEN_COUNT; i++) {

                createSalesMenFile(
                        20,
                        "Salesman" + i,
                        1000 + i);
            }

            System.out.println("Files generated successfully.");

        } catch (IOException exception) {

            System.out.println("Error generating files.");
            exception.printStackTrace();
        }
    }

    /**
     * Creates a products file.
     *
     * File format:
     * ProductId;ProductName;ProductPrice
     *
     * @param productsCount Number of products.
     * @throws IOException If a file error occurs.
     */
    public static void createProductsFile(int productsCount)
            throws IOException {

        PrintWriter writer =
                new PrintWriter(
                        new FileWriter("products.txt"));

        for (int productId = 1;
             productId <= productsCount;
             productId++) {

            String productName =
                    "Product" + productId;

            double productPrice =
                    10 + RANDOM.nextInt(991);

            writer.println(
                    productId + ";"
                            + productName + ";"
                            + productPrice);
        }

        writer.close();
    }

    /**
     * Creates a salesman information file.
     *
     * File format:
     * DocumentType;DocumentNumber;FirstName;LastName
     *
     * @param salesmanCount Number of salesmen.
     * @throws IOException If a file error occurs.
     */
    public static void createSalesManInfoFile(int salesmanCount)
            throws IOException {

        String[] firstNames = {
                "John",
                "Michael",
                "James",
                "William",
                "David"
        };

        String[] lastNames = {
                "Smith",
                "Johnson",
                "Brown",
                "Wilson",
                "Garcia"
        };

        PrintWriter writer =
                new PrintWriter(
                        new FileWriter(
                                "salesmen_info.txt"));

        for (int i = 1; i <= salesmanCount; i++) {

            long documentNumber =
                    1000 + i;

            String firstName =
                    firstNames[
                            RANDOM.nextInt(
                                    firstNames.length)];

            String lastName =
                    lastNames[
                            RANDOM.nextInt(
                                    lastNames.length)];

            writer.println(
                    "CC;"
                            + documentNumber + ";"
                            + firstName + ";"
                            + lastName);
        }

        writer.close();
    }

    /**
     * Creates a sales file for a salesman.
     *
     * File format:
     * CC;DocumentNumber
     * ProductId;Quantity
     *
     * @param randomSalesCount Number of sales records.
     * @param name Salesman name.
     * @param id Salesman identifier.
     * @throws IOException If a file error occurs.
     */
    public static void createSalesMenFile(
            int randomSalesCount,
            String name,
            long id)
            throws IOException {

        PrintWriter writer =
                new PrintWriter(
                        new FileWriter(
                                "salesman_" + id + ".txt"));

        writer.println("CC;" + id);

        for (int i = 0;
             i < randomSalesCount;
             i++) {

            int productId =
                    RANDOM.nextInt(
                            PRODUCTS_COUNT) + 1;

            int quantity =
                    RANDOM.nextInt(50) + 1;

            writer.println(
                    productId + ";"
                            + quantity);
        }

        writer.close();
    }
}
