package bridge;


/**
 * @author wangyu
 * @date 2021/12/21 21:16
 */
public class BridgeMain {
    public static void main(String[] args) {
        Color red = new Red();      //红色
        Shape circle = new Circle();        //圆形
        circle.setColor(red);
        circle.draw();              //画红色的圆形

        Color rainbow = new Rainbow();      //彩色
        Shape triangle = new Triangle();    //三角形
        triangle.setColor(rainbow);
        triangle.draw();            //画彩色的三角形
    }
}
