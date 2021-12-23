package pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangyu
 * @date 2021/12/23 14:32
 */
//恢复备忘录状态
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
