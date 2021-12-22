package pattern.state;

/**
 * @author wangyu
 * @date 2021/12/22 19:27
 */
public class Context {
    private State state;

    public Context() {
        this.state = new Astate();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return (state);
    }

    public void handle() {
        state.handle(this);
    }
}
