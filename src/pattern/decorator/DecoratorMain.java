package pattern.decorator;

/**
 * @author wangyu
 * @date 2021/12/22 10:11
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Product phone = new Phone();
        phone.function();
        System.out.println("=========================");

        Product new_phone = new PhoneDecorator(phone);
        new_phone.function();
    }
}
