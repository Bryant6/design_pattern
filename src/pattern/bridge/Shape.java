package pattern.bridge;

/**
 * @author wangyu
 * @date 2021/12/21 21:06
 */
//形状抽象类
public abstract class Shape {
    Color color;

    public abstract void draw();    //画形状

    public void setColor(Color color) {
        this.color = color;
    }
}
