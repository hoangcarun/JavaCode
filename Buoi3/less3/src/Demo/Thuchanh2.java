package Demo;

public class Thuchanh2 {
    private String prodld;
    private String prodName;
    private String manufacturer;
    private String producerPrice;

    public Thuchanh2() {
    }

    public Thuchanh2(String prodId, String prodName, String manufacturer, String producerPrice) {
        this.prodld = prodId;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
    }


    public String getProdld() {
        return prodld;
    }

    public void setProdld(String prodld) {
        this.prodld = prodld;
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
    public void input() {
    }
    public void display() {
    }
    public float calculateSalePrice() {
        // Thực hiện logic tính giá bán ở đây
        float producerPriceFloat = Float.parseFloat(producerPrice);
        return producerPriceFloat + 0.05f * producerPriceFloat;
    }


}
