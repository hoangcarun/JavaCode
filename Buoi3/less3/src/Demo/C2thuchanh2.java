package Demo;

import java.util.Scanner;

public class C2thuchanh2 extends Thuchanh2 {
    private float taxImported;

        // Các constructor
        public C2thuchanh2() {
        }

        public C2thuchanh2(String prodId, String prodName, String manufacturer, String producerPrice, float taxImported) {
            super(prodId, prodName, manufacturer, producerPrice);
            this.taxImported = taxImported;
        }



        public float getTaxImported() {

            return taxImported;
        }

    public void setTaxImported(float taxImported) {this.taxImported = taxImported;}

    // override
    @Override
    public void input() {
        super.input(); // Gọi phương thức input() của lớp cha để nhập thông tin

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Import Tax: ");
        taxImported = scanner.nextFloat();
    }

    @Override
    public void display() {

        super.display();

        System.out.println("Import Tax: " + taxImported);
    }

    @Override
    public float calculateSalePrice() {
        float producerPriceFloat = Float.parseFloat(getProducerPrice());
        return producerPriceFloat + 0.05f * producerPriceFloat + taxImported;
    }
    public static void main(String[] args) {
        // Tạo đối tượng Product
        Thuchanh2 product = new Thuchanh2();
        System.out.println("Enter information for the product:");
        product.input();
        System.out.println("\nProduct Information:");
        product.display();
        System.out.println("Sale Price: $" + product.calculateSalePrice());


        C2thuchanh2 importPrice = new C2thuchanh2();
        System.out.println("\nEnter information for the imported product:");
        importPrice.input();
        System.out.println("\nImported Product Information:");
        importPrice.display();
        System.out.println("Sale Price: $" + importPrice.calculateSalePrice());
    }


    }

