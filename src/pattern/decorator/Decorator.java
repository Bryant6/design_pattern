package pattern.decorator;

/**
 * @author wangyu
 * @date 2021/12/22 10:06
 */
//装饰器
public class Decorator implements Product {
    private Product product;

    public Decorator(Product product){
        this.product = product;
    }
    @Override
    public void function() {
        product.function();
    }
}
