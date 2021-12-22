package pattern.observer;

/**
 * @author wangyu
 * @date 2021/12/22 19:43
 */
//观察者A
public class CObserver extends Observer {
    @Override
    public void update() {
        System.out.println("观察者C做出反应");
    }
}
