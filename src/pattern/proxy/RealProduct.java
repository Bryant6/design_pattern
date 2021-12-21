package pattern.proxy;

/**
 * @author wangyu
 * @date 2021/12/21 20:16
 */
//接口的实体类
public class RealProduct implements Product {
    @Override
    public void show() {
        System.out.println("获取到一个真实产品RealProduct！");
    }
}
