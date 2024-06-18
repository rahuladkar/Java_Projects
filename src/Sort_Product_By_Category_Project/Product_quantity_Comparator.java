package Sort_Product_By_Category_Project;

import java.util.Comparator;

public class Product_quantity_Comparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Product product1 = (Product) o1;
        Product product2 = (Product) o2;
        return (int)(product1.getQuantity() - product2.getQuantity());
    }
}
