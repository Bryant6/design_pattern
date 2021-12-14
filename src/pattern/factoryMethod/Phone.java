package pattern.factoryMethod;

/**
 * @author wangyu
 * @date 2021/12/14 19:21
 */

//手机
public class Phone implements Product {
    @Override
    public void product() {
        System.out.println("生产了一个牛逼的智能手机");
    }
}
