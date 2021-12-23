package pattern.visitor;

/**
 * @author wangyu
 * @date 2021/12/23 15:45
 */
public class VisitorMain {
    public static void main(String[] args) {
        Structure structure = new Structure();
        structure.add(new AElement());
        structure.add(new BElement());

        Visitor visitor_A = new AVisitor();
        structure.accept(visitor_A);

        Visitor visitor_B = new BVisitor();
        structure.accept(visitor_B);
    }
}
