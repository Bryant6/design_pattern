package pattern.factoryMethod;

/**
 * @author wangyu
 * @date 2021/12/14 19:25
 */

//飞机
public class Plane implements Product {
    @Override
    public void product() {
        System.out.println("生产了一架飞机，随时带你起飞");
    }
}
