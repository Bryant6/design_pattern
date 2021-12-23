package pattern.mediator;

/**
 * @author wangyu
 * @date 2021/12/23 14:51
 */
//一个用户
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        Mediator.send(this,message);
    }
}
