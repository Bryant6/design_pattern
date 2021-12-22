package pattern.template;

/**
 * @author wangyu
 * @date 2021/12/22 16:29
 */
public class TemplateMain {
    public static void main(String[] args) {
        TemplateClass template1 = new ConcreteClass1();
        template1.templateMethod();

        TemplateClass template2 = new ConcreteClass2();
        template2.templateMethod();
    }
}
