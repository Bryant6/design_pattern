package pattern.command;

/**
 * @author wangyu
 * @date 2021/12/22 18:32
 */
public class Command {
    private Receiver receiver;

    public Command(){
        receiver = new Receiver();
    }

    public void execute(){
        System.out.println("命令传到了接收者");
        receiver.action();
    }
}
