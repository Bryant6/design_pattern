package pattern.abstractFactory;

/**
 * @author wangyu
 * @date 2021/12/15 16:25
 */
//产品上色的工厂
public class ColorFactory extends AbstractFactory {
    @Override
    public Product createProduct(String productType) {
        return null;
    }

    @Override
    public Color drawColor(String colorType) {
        if(colorType.equals("红色")){
            return new Red();
        }else if(colorType.equals("绿色")){
            return new Green();
        }else if(colorType.equals("彩虹色")){
            return new Rainbow();
        }else {
            System.out.println("传入产品类型有误！");
        }
        return null;
    }
}
