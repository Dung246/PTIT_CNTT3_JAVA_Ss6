class Product {
    private String productId;
    private String productName;
    private double price;

    Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        setPrice(price);
    }
    String getProductId() {
        return productId;
    }
    String getProductName() {
        return productName;
    }
    double getPrice() {
        return price;
    }
    void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Giá sản phẩm không hợp lệ (>0)");
        }
    }

    void displayInfo() {
        System.out.println("Mã sản phẩm: " + productId);
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Giá bán: " + price);
        System.out.println("----------------------");
    }
}

public class B3 {
    public static void main(String[] args) {
        Product first = new Product("SP01", "Laptop", 15000000);

        first.displayInfo();

        first.setPrice(-5000);   // giá không hợp lệ
        first.setPrice(17000000); // giá hợp lệ

        first.displayInfo();
    }
}
