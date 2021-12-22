package pattern.decorator;

/**
 * @author wangyu
 * @date 2021/12/22 10:00
 */
//手机实体
public class Phone implements Product {
    public Phone(){
        System.out.println("创建一个手机");
    }
    @Override
    public void function() {
        System.out.println("手机可以用来打电话");
    }
}
