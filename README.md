# Sales Management Project

## Programming Fundamentals

### Second Delivery

This project corresponds to the second delivery of the Programming Fundamentals course project.

The application generates test files, reads sales information, processes sales records, and creates CSV reports for salesmen and products.

---

## Main Classes

### GenerateInfoFiles

Generates pseudo-random input files required by the project:

- products.txt
- salesmen_info.txt
- salesman_1001.txt
- salesman_1002.txt
- salesman_1003.txt
- salesman_1004.txt
- salesman_1005.txt

### Main

Processes the generated files and creates the final reports:

- salesmen_report.csv
- products_report.csv

---

## Project Structure

```text
src
│
├── GenerateInfoFiles.java
├── Main.java
├── Product.java
├── ProductReport.java
├── Salesman.java
├── Sale.java
├── FileManager.java
└── ReportGenerator.java
```

---

## Generated Input Files

### Products File

```text
ProductId;ProductName;ProductPrice
```

Example:

```text
1;Product1;150
2;Product2;300
3;Product3;450
```

### Salesmen Information File

```text
DocumentType;DocumentNumber;FirstName;LastName
```

Example:

```text
CC;1001;John;Smith
CC;1002;Michael;Wilson
```

### Sales File

```text
DocumentType;DocumentNumber
ProductId;Quantity
ProductId;Quantity
```

Example:

```text
CC;1001
5;10
3;7
8;20
```

---

## Generated Reports

### Salesmen Report

File:

```text
salesmen_report.csv
```

This report contains all salesmen sorted from highest to lowest revenue.

Example:

```text
William Smith;315035.0
John Wilson;287466.0
Michael Smith;259639.0
```

---

### Products Report

File:

```text
products_report.csv
```

This report contains all products sorted by total quantity sold in descending order.

Example:

```text
Product18;859.0;95
Product5;755.0;82
Product2;124.0;75
```

Format:

```text
ProductName;ProductPrice;QuantitySold
```

---

## Implemented Features

- Automatic generation of test files.
- Product information loading.
- Salesman information loading.
- Sales file processing.
- Revenue calculation by salesman.
- Product sales aggregation.
- Descending sorting of salesmen by revenue.
- Descending sorting of products by quantity sold.
- CSV report generation.

---

## Requirements

- Java 8 or higher.
- Eclipse IDE for Java
