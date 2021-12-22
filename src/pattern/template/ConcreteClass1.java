package pattern.template;

/**
 * @author wangyu
 * @date 2021/12/22 16:26
 */
public class ConcreteClass1 extends TemplateClass {
    @Override
    public void method1() {
        System.out.println("根据模板指定的方案一的第一步");
    }

    @Override
    public void method2() {
        System.out.println("根据模板指定的方案一的第二步");
    }
}
