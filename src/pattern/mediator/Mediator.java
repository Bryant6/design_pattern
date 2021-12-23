package pattern.mediator;

import java.util.Date;

/**
 * @author wangyu
 * @date 2021/12/23 14:52
 */
//中介类
public class Mediator {
    public static void send(Person person,String message){
        System.out.println(new Date().toString() + " | " + person.getName() + ":" + message);
    }
}
