package pattern.interpreter;

/**
 * @author wangyu
 * @date 2021/12/22 16:51
 */
//抽象表达式接口
public interface Expression {
    public boolean interpret(String context);
}
