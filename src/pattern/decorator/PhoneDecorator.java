package pattern.decorator;

/**
 * @author wangyu
 * @date 2021/12/22 10:09
 */
//手机装饰器
public class PhoneDecorator extends Decorator {
    public PhoneDecorator(Product product) {
        super(product);
    }


    @Override
    public void function() {
        super.function();
        addFunction();
    }

    public void addFunction(){
        System.out.println("给手机增加一个发短信的功能");
    }
}
