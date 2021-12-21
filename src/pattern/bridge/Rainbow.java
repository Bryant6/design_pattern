package pattern.bridge;

/**
 * @author wangyu
 * @date 2021/12/21 21:09
 */
//彩色
public class Rainbow implements Color {
    @Override
    public void colorByShape() {
        System.out.print("彩色的");
    }
}
