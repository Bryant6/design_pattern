package pattern.state;

/**
 * @author wangyu
 * @date 2021/12/22 19:28
 */
//状态A
public class Astate extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态为A，A状态执行结束，改变状态为B");
        context.setState(new Bstate());
    }
}
