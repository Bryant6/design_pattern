package pattern.state;

/**
 * @author wangyu
 * @date 2021/12/22 19:28
 */
//状态B
public class Bstate extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前状态为B，B状态执行结束，改变状态为A");
        context.setState(new Astate());
    }
}
