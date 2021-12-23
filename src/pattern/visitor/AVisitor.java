package pattern.visitor;

/**
 * @author wangyu
 * @date 2021/12/23 15:35
 */
public class AVisitor implements Visitor {
    @Override
    public void visit(Element element) {
        System.out.println(this.getClass().getName() + "访问了" + element.getClass().getName());
    }
}
