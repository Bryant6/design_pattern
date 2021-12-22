package pattern.interpreter;

/**
 * @author wangyu
 * @date 2021/12/22 16:59
 */
public class AndExpression implements Expression {
    private Expression brand = null;
    private Expression size = null;

    public AndExpression(Expression brand, Expression size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public boolean interpret(String context) {
        String[] info = context.split(" ");
        return brand.interpret(info[0]) && size.interpret(info[1]);     //当品牌和尺寸都满足的时候才买
    }
}
