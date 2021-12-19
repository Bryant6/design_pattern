package pattern.builder;

/**
 * @author wangyu
 * @date 2021/12/19 13:18
 */
public class BuilderMain {
    public static void main(String[] args) {
        Builder builder = new Builder();
        Leader leader = new Leader(builder);

        Computer computer = leader.build();
        computer.showMessage();
    }
}
