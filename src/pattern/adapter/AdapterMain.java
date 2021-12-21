package pattern.adapter;

/**
 * @author wangyu
 * @date 2021/12/20 17:05
 */
public class AdapterMain {
    public static void main(String[] args) {
        W200 w200 = new W200();

        //通过适配器使用100w充电器给200w电脑充电
        System.out.print("过适配器使用100w充电器给200w电脑充电:");
        w200.charge("100w");
        //通过适配器使用300w充电器给200w电脑充电
        System.out.print("过适配器使用300w充电器给200w电脑充电:");
        w200.charge("300w");

    }
}
