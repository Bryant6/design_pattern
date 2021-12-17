package pattern.prototype;

/**
 * @author wangyu
 * @date 2021/12/17 19:31
 */
public class Product implements Cloneable {

    Product(){
        System.out.println("创建一个原型对象");
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("克隆一个原型对象");
        return super.clone();
    }
}
