package pattern.abstractFactory;


/**
 * @author wangyu
 * @date 2021/12/15 15:36
 */
public class FactoryMain {
    public static void main(String[] args) {
        //获取生产产品的工厂
        AbstractFactory product = FactoryProducer.getFactory("产品厂");
        //获取增加颜色的工厂
        AbstractFactory color = FactoryProducer.getFactory("颜色厂");

        //生产一部手机
        Product phone = product.createProduct("手机");
        phone.product();
        //为手机上色
        Color red = color.drawColor("红色");
        red.coloring();

    }
}
