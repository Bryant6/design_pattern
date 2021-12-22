package pattern.command;

/**
 * @author wangyu
 * @date 2021/12/22 18:39
 */
public class CommandMain {
    public static void main(String[] args) {
        Command command = new Command();
        Invoker invoker = new Invoker(command);
        invoker.send();
    }
}
