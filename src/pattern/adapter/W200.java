package pattern.adapter;

/**
 * @author wangyu
 * @date 2021/12/20 17:01
 */
//200w充电器
public class W200 implements Charge {

    ChargeAdapter chargeAdapter;
    @Override
    public void charge(String type) {
        if(type.equals("200w")){
            System.out.println("200W充电器正常充电");
        }else if(type.equals("100w")) {
            chargeAdapter = new ChargeAdapter(type);
            chargeAdapter.charge(type);
        }else{
            System.out.println("功率不兼容，充电失败！！！");
        }
    }
}
