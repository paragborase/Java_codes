import java.util.ArrayList;
import java.util.List;

class ProductX {
    Integer productId;
    String productName;
    Integer productPrice;

    public ProductX(Integer productId,String productName,Integer productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }
}

public class Filter2 {
    public static void main(String[] args) {
        List<ProductX> list = new ArrayList<ProductX>();
        list.add(new ProductX(1,"Dell",25000));
        list.add(new ProductX(2,"Microsoft",45000));
        list.add(new ProductX(3,"Apple MacBook",50000));

        list.stream().filter(e->e.productPrice>25000).forEach(e->System.out.println(e.productName));
}
}
