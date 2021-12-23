package pattern.visitor;

/**
 * @author wangyu
 * @date 2021/12/23 15:41
 */
public class BElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
