package pattern.strategy;

/**
 * @author wangyu
 * @date 2021/12/22 18:26
 */
public class StrategyMain {
    public static void main(String[] args) {
        int x = 24;
        int y = 8;
        Context context1 = new Context(new AddStrategy());
        int add = context1.execute(x,y);
        System.out.println("x = 24, y = 8, x+y=" + add);

        Context context2 = new Context(new SubStrategy());
        int sub = context2.execute(x,y);
        System.out.println("x = 24, y = 8, x-y=" + sub);

        Context context3 = new Context(new MultStrategy());
        int mult = context3.execute(x,y);
        System.out.println("x = 24, y = 8, x*y=" + mult);
    }
}
