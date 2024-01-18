package Demo;

import java.util.Scanner;

public class Thuchanh2 {
    private String prodId;
    private String prodName;
    private String manufacturer;
    private String producerPrice;

    public Thuchanh2() {
    }

    public Thuchanh2(String prodId, String prodName, String manufacturer, String producerPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
    }
    // Setters and Getters
    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(String producerPrice) {
        this.producerPrice = producerPrice;
    }

    // Input method
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        prodId = scanner.nextLine();

        System.out.print("Enter Product Name: ");
        prodName = scanner.nextLine();

        System.out.print("Enter Manufacturer: ");
        manufacturer = scanner.nextLine();

        System.out.print("Enter Producer Price: ");
        producerPrice = scanner.nextLine();
    }

    // Display method
    public void display() {
        System.out.println("Product ID: " + prodId);
        System.out.println("Product Name: " + prodName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Producer Price: " + producerPrice);
    }

    // Calculate Sale Price method
    public float calculateSalePrice() {
        float producerPriceFloat = Float.parseFloat(producerPrice);
        return producerPriceFloat + 0.05f * producerPriceFloat;
    }

}


