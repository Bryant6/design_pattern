package pattern.responsibility_chain;

/**
 * @author wangyu
 * @date 2021/12/22 20:07
 */
//处理者抽象类
public abstract class Handler {
    private Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(String request);
}
