package pattern.bridge;

/**
 * @author wangyu
 * @date 2021/12/21 21:13
 */
//圆形
public class Circle extends Shape {
    @Override
    public void draw() {
        this.color.colorByShape();
        System.out.println("圆形的");
    }
}
