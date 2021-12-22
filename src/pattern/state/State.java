package pattern.state;

/**
 * @author wangyu
 * @date 2021/12/22 19:26
 */
//抽象状态类
public abstract class State {
    public abstract void handle(Context context);
}
