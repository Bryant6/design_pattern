package pattern.memento;

/**
 * @author wangyu
 * @date 2021/12/23 14:33
 */
public class MementoMain {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker careTaker = new Caretaker();
        originator.setState("状态：S1");
        originator.setState("状态：S2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("状态：S3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("状态：S4");

        System.out.println("当前状态" + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("第一次保存的状态" + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("第二次保存的状态" + originator.getState());
    }
}
