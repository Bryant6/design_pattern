package pattern.flyweight;

/**
 * @author wangyu
 * @date 2021/12/22 14:36
 */
//手机类
public class Phone {
    private String brand;       //品牌
    private int cost;           //价格

    public Phone(String brand){
        this.brand = brand;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", cost=" + cost +
                '}';
    }
}
