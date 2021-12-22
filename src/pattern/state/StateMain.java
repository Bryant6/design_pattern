package pattern.state;

/**
 * @author wangyu
 * @date 2021/12/22 19:32
 */
public class StateMain {
    public static void main(String[] args) {
        Context context = new Context();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}
