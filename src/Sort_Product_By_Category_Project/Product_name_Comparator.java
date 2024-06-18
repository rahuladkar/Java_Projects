package Sort_Product_By_Category_Project;

import java.util.Comparator;

public class Product_name_Comparator  implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Product product1 = (Product) o1;
        Product product2 = (Product) o2;
        return product1.getName().compareTo(product2.getName());
    }
}
