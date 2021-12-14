package pattern.factoryMethod;

/**
 * @author wangyu
 * @date 2021/12/14 19:23
 */
//电脑
public class Computer implements Product {
    @Override
    public void product() {
        System.out.println("生产了一台程序员都想要的电脑");
    }
}
