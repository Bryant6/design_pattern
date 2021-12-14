package pattern.factoryMethod;

/**
 * @author wangyu
 * @date 2021/12/14 19:26
 */
//工厂类
public class Factory {
    //通过productType获取产品对象
    public Product getProduct(String productType){
        if(productType.equals("手机")){
            return new Phone();
        }else if(productType.equals("电脑")){
            return new Computer();
        }else if(productType.equals("飞机")){
            return new Plane();
        }else {
            System.out.println("传入产品类型有误！");
        }
        return null;
    }
}
