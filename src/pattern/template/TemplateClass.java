package pattern.template;

/**
 * @author wangyu
 * @date 2021/12/22 16:20
 */
//模板类
public abstract class TemplateClass {
    public void templateMethod(){
        specificMethod();
        method1();
        method1();
    }

    public void specificMethod(){
        System.out.println("模板中规定的特殊方法");
    }

    public abstract void method1();

    public abstract void method2();
}
