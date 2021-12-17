package pattern.prototype;

/**
 * @author wangyu
 * @date 2021/12/17 19:34
 */
public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Product product = new Product();
        System.out.println(product);

        Product productCloned = (Product) product.clone();

        System.out.println(productCloned);
    }
}
