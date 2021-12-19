package pattern.builder;

/**
 * @author wangyu
 * @date 2021/12/19 13:09
 */
public class Builder extends AbstractBuilder {
    @Override
    public void buildMainFrame() {
        computer.setMainFrame("建造好了主机");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("建造好了显示器");
    }

    @Override
    public void buildKeyboard() {
        computer.setKeyboard("建造好了键鼠套装");
    }
}

abstract class AbstractBuilder {
    //创建一个电脑对象
    Computer computer = new Computer();

    //构造主机
    public abstract void buildMainFrame();

    //构造显示器
    public abstract void buildDisplay();

    //构造键鼠套装
    public abstract void buildKeyboard();

    //返回电脑对象
    public Computer returnComputer(){
        return computer;
    }
}
