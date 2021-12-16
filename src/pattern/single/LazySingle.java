package pattern.single;

/**
 * @author wangyu
 * @date 2021/12/16 16:01
 */
//懒汉式
public class LazySingle {
    private static LazySingle instance;

    private LazySingle(){}

    public static synchronized LazySingle getInstance(){
        if (instance == null){
            instance = new LazySingle();
        }

        return instance;
    }
}
