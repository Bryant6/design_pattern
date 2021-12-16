package pattern.single;

/**
 * @author wangyu
 * @date 2021/12/16 16:08
 */
public class SingleMain {
    public static void main(String[] args) {
        LazySingle lazySingle1 = LazySingle.getInstance();
        LazySingle lazySingle2 = LazySingle.getInstance();

        System.out.println("懒汉式创建的第一个对象：" + lazySingle1);
        System.out.println("懒汉式创建的第二个对象：" + lazySingle2);
        System.out.println(lazySingle1 == lazySingle2);

        HungrySingle hungrySingle1 = HungrySingle.getInstance();
        HungrySingle hungrySingle2 = HungrySingle.getInstance();

        System.out.println("饿汉式创建的第一个对象：" + hungrySingle1);
        System.out.println("饿汉式创建的第二个对象：" + hungrySingle2);
        System.out.println(hungrySingle1 == hungrySingle2);

    }
}
