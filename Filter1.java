import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Product{
    int productId;
    String productName;
    int productValue;

    public Product(int productId,String productName,int productValue){
        this.productId = productId;
        this.productName = productName;
        this.productValue = productValue;
    }
}

public class Filter1 {
    public static void main(String[] args) {
        

        List<Product> productList = new ArrayList<Product>();

        productList.add(new Product(12,"Laptop",50000));
        productList.add(new Product(11,"Mouse",500));
        productList.add(new Product(10,"Adaptor",800));

        List<Product> collect = productList.stream().filter(p->p.productValue>500).collect(Collectors.toList());
        System.out.println(collect.size());    
    }
}
