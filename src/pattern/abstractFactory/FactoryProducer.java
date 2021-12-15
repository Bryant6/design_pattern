package pattern.abstractFactory;


/**
 * @author wangyu
 * @date 2021/12/15 15:41
 */
//工厂生成器
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        if(type.equals("产品厂")){
            return new ProductFactory();
        } else if(type.equals("颜色厂")){
            return new ColorFactory();
        }
        return null;
    }
}
