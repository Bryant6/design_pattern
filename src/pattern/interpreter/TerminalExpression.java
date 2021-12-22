package pattern.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wangyu
 * @date 2021/12/22 16:53
 */
//终结符表达式
public class TerminalExpression implements Expression {
    private String message;

    public TerminalExpression(String message){
        this.message = message;
    }

    @Override
    public boolean interpret(String context) {
        if(context.equals(message)){
            return true;
        }else{
            return false;
        }
    }
}
