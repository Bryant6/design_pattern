package bridge;

/**
 * @author wangyu
 * @date 2021/12/21 21:13
 */
//三角形
public class Triangle extends Shape {
    @Override
    public void draw() {
        this.color.colorByShape();
        System.out.println("三角形的");
    }
}
