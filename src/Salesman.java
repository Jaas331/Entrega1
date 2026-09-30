public class Salesman {

    private String documentType;
    private long documentNumber;
    private String firstName;
    private String lastName;
    private double totalSales;

    public Salesman(String documentType,
            long documentNumber,
            String firstName,
            String lastName) {

        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = 0;
    }

    public String getDocumentType() {
        return documentType;
    }

    public long getDocumentNumber() {
        return documentNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void addSales(double amount) {
        totalSales += amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
}
