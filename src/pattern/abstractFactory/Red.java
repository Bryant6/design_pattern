package pattern.abstractFactory;

/**
 * @author wangyu
 * @date 2021/12/15 15:32
 */

//红色
public class Red implements Color {
    @Override
    public void coloring() {
        System.out.println("为产品增添了一层中国红");
    }
}
