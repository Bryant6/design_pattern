package pattern.abstractFactory;

/**
 * @author wangyu
 * @date 2021/12/15 15:31
 */
//电脑类
public class Computer implements Product {
    @Override
    public void product() {
        System.out.println("生产了一台程序员都想要的电脑");
    }
}
