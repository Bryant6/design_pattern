package pattern.abstractFactory;

/**
 * @author wangyu
 * @date 2021/12/15 15:33
 */
//绿色
public class Green implements Color {
    @Override
    public void coloring() {
        System.out.println("为产品赋予大自然之绿");
    }
}
