package pattern.abstractFactory;

/**
 * @author wangyu
 * @date 2021/12/15 16:25
 */
//生产产品的工厂
public class ProductFactory extends AbstractFactory {
    @Override
    public Product createProduct(String productType) {
        if(productType.equals("手机")){
            return new Phone();
        }else if(productType.equals("电脑")){
            return new Computer();
        }else if(productType.equals("飞机")){
            return new Plane();
        }else {
            System.out.println("传入产品类型有误！");
        }
        return null;
    }

    @Override
    public Color drawColor(String colorType) {
        return null;
    }
}
