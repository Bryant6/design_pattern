package pattern.facade;

/**
 * @author wangyu
 * @date 2021/12/22 14:16
 */
public class Facade {
    private Design design = new Design();
    private Model model = new Model();
    private Run run = new Run();

    public void method(){
        design.design();
        model.model();
        run.run();
    }
}
