package pattern.abstractFactory;

/**
 * @author wangyu
 * @date 2021/12/15 15:24
 */
//抽象工厂类
public abstract class AbstractFactory {
    //生产产品的工厂
    public abstract Product createProduct(String productType);

    //为产品上色的工厂
    public abstract Color drawColor(String colorType);
}
