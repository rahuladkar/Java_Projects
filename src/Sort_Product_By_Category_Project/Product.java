package Sort_Product_By_Category_Project;

public class Product {

    private int pid;
    private String name;
    private double price;
    private int quantity;

    // getter() and setter()
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // constructor to initialize the data
    public Product(int pid, String name, double price, int quantity) {
        this.pid = pid;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // overridden toString() to print the data
    @Override
    public String toString() {
        return "Products { " +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity + " }\n";
    }

}
