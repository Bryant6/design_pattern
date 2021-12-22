package pattern.observer;

/**
 * @author wangyu
 * @date 2021/12/22 19:55
 */
public class VisitorMain {
    public static void main(String[] args) {
        Subject subject = new Subject();

        subject.add(new AObserver());
        subject.add(new BObserver());
        subject.add(new CObserver());

        System.out.println("主体状态改变");
        subject.setState("change");
    }
}
