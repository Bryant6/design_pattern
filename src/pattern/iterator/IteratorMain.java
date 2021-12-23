package pattern.iterator;


/**
 * @author wangyu
 * @date 2021/12/23 15:12
 */
public class IteratorMain {
    public static void main(String[] args) {
        String[] names = {"张三","李四","王五","赵六","小七","老八"};
        Container container = new Container(names);
        Iterator iterator = container.getIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
