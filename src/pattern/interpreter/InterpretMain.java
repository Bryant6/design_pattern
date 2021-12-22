package pattern.interpreter;

/**
 * @author wangyu
 * @date 2021/12/22 17:14
 */
public class InterpretMain {
    public static void main(String[] args) {
        Context context = new Context();
        context.result("戴尔 13寸");
        context.result("华硕 16寸");
        context.result("联想 13寸");
        context.result("联想 16寸");
    }
}
