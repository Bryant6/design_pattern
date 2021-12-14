package pattern.factoryMethod;

/**
 * @author wangyu
 * @date 2021/12/14 19:31
 */
public class FactoryMain {
    public static void main(String[] args) {
        //创建一个工厂
        Factory factory = new Factory();

        //通过工厂获取手机对象，并创建一个手机
        Product phone = factory.getProduct("手机");
        phone.product();

        //通过工厂获取电脑对象，并创建一个电脑
        Product computer = factory.getProduct("电脑");
        computer.product();

        //通过工厂获取飞机对象，并创建一个飞机
        Product plane = factory.getProduct("飞机");
        plane.product();
    }
}
