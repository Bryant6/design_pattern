package pattern.memento;

/**
 * @author wangyu
 * @date 2021/12/23 14:28
 */
//备忘录类
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
