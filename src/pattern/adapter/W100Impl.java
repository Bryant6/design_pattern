package pattern.adapter;

/**
 * @author wangyu
 * @date 2021/12/20 16:55
 */
//100W充电的实现类
public class W100Impl implements W100 {
    @Override
    public void charge100W() {
        System.out.println("使用100W充电器给电脑充电");
    }
}
