package bridge;

/**
 * @author wangyu
 * @date 2021/12/21 21:13
 */
//矩形
public class Rectangle extends Shape {
    @Override
    public void draw() {
        this.color.colorByShape();
        System.out.println("矩形的");
    }
}
