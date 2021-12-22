package pattern.strategy;

/**
 * @author wangyu
 * @date 2021/12/22 18:23
 */
public class MultStrategy implements Strategy {
    @Override
    public int operate(int x, int y) {
        return x * y;
    }
}
