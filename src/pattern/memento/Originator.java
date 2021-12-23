package pattern.memento;

/**
 * @author wangyu
 * @date 2021/12/23 14:29
 */
//获取备忘录状态
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
