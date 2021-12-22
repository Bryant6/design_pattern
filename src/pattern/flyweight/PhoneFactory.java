package pattern.flyweight;

import java.util.HashMap;

/**
 * @author wangyu
 * @date 2021/12/22 14:39
 */
public class PhoneFactory {
    private static final HashMap<String,Phone> pool = new HashMap<>();

    public static Phone getPhone(String brand){
        Phone phone = pool.get(brand);

        if(phone == null){
            phone = new Phone(brand);
            pool.put(brand,phone);
            System.out.println("创建了一个" + brand + "手机");
        }

        return phone;

    }
}
