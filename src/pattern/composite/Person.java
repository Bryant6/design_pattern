package pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangyu
 * @date 2021/12/22 14:57
 */
//表示一个人
public class Person {
    private String type;        //职位
    private String name;        //姓名
    private List<Person> person_list;       //管理的人员

    public Person(String type, String name) {
        this.type = type;
        this.name = name;
        person_list = new ArrayList<>();
    }

    public void add(Person person){
        person_list.add(person);
    }

    public void remove(Person person){
        person_list.remove(person);
    }

    public List<Person> getPerson_list(){
        return person_list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
