package pattern.flyweight;

/**
 * @author wangyu
 * @date 2021/12/22 14:44
 */
public class FlyWeightMain {
    public static void main(String[] args) {
        String[] brands = {"华为","vivo","oppo","小米","华为","vivo","oppo","小米","华为"};
        for(int i=0;i<brands.length;i++){
            Phone phone = PhoneFactory.getPhone(brands[i]);
            phone.setCost((int) (Math.random() * 5000));
            System.out.println(phone.toString());
        }

    }
}
