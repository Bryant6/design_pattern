package pattern.strategy;

/**
 * @author wangyu
 * @date 2021/12/22 18:25
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int x,int y){
        return strategy.operate(x,y);
    }
}
