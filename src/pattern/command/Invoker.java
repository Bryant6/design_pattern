package pattern.command;

/**
 * @author wangyu
 * @date 2021/12/22 18:37
 */
public class Invoker {
    private Command command;
    public Invoker(Command command){
        this.command = command;
    }

    public void send(){
        System.out.println("调用者收到命令");
        command.execute();
    }
}
