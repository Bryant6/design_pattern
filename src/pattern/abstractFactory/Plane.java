package pattern.abstractFactory;

/**
 * @author wangyu
 * @date 2021/12/15 15:30
 */
//飞机类
public class Plane implements Product {
    @Override
    public void product() {
        System.out.println("生产了一架飞机，随时带你起飞");
    }
}
