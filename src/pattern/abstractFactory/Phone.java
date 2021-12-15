package pattern.abstractFactory;

/**
 * @author wangyu
 * @date 2021/12/15 15:29
 */
//手机类
public class Phone implements Product {
    @Override
    public void product() {
        System.out.println("生产了一个牛逼的智能手机");
    }
}
