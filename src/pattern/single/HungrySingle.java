package pattern.single;

/**
 * @author wangyu
 * @date 2021/12/16 16:02
 */
//饿汉式
public class HungrySingle {

    private final static HungrySingle instance = new HungrySingle();

    private HungrySingle(){}

    public static HungrySingle getInstance(){
        return instance;
    }
}
