package pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangyu
 * @date 2021/12/23 15:42
 */
public class Structure {
    private List<Element> elements = new ArrayList<>();

    public void add(Element element){
        elements.add(element);
    }

    public void remove(Element element){
        elements.remove(element);
    }

    public void accept(Visitor visitor){
        for(Element element:elements){
            visitor.visit(element);
        }
    }
}
