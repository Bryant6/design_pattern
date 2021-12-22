package pattern.interpreter;

/**
 * @author wangyu
 * @date 2021/12/22 17:03
 */
//上下文环境类
public class Context {
    private String brand = "联想";
    private String size = "16寸";
    private Expression expression = null;

    public Context(){
        Expression brand = new TerminalExpression(this.brand);
        Expression size = new TerminalExpression(this.size);
        expression = new AndExpression(brand,size);
    }

    public void result(String context){
        boolean target = expression.interpret(context);
        if(target){
            System.out.println(context + "：是我想要的电脑，买了");
        }else{
            System.out.println(context + ": 不满足我的要求");
        }
    }
}
