package pattern.mediator;

/**
 * @author wangyu
 * @date 2021/12/23 14:55
 */
public class MediatorMain {
    public static void main(String[] args) {
        Person person1 = new Person("张三");
        Person person2 = new Person("李四");

        person1.sendMessage("你好啊，李四，最近怎么样");
        person2.sendMessage("我很好，张三你呢");
    }
}
