package pattern.bridge;

/**
 * @author wangyu
 * @date 2021/12/21 21:09
 */
//绿色
public class Green implements Color {
    @Override
    public void colorByShape() {
        System.out.print("绿色的");
    }
}
