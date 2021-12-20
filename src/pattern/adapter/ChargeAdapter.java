package pattern.adapter;

/**
 * @author wangyu
 * @date 2021/12/20 16:57
 */
//适配器
public class ChargeAdapter implements Charge {
    W100 w100;

    public ChargeAdapter(String type){
        if(type.equals("100w")){
            w100 = new W100Impl();
        }
    }

    @Override
    public void charge(String type) {
        w100.charge100W();
    }
}
