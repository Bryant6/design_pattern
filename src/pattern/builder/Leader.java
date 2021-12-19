package pattern.builder;

/**
 * @author wangyu
 * @date 2021/12/19 13:16
 */
public class Leader {
    private Builder builder;

    public Leader(Builder builder){
        this.builder = builder;
    }

    public Computer build(){
        builder.buildMainFrame();
        builder.buildDisplay();
        builder.buildKeyboard();
        return builder.returnComputer();
    }
}
