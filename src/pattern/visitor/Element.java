package pattern.visitor;

/**
 * @author wangyu
 * @date 2021/12/23 15:34
 */
public interface Element {
    void accept(Visitor visitor);
}
