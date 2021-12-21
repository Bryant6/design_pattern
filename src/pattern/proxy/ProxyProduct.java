package pattern.proxy;

/**
 * @author wangyu
 * @date 2021/12/21 20:18
 */
//接口的代理类
public class ProxyProduct implements Product {
    private RealProduct realProduct;

    @Override
    public void show() {
        if(realProduct == null){
            realProduct = new RealProduct();
        }


        pre();          //代理增强方法，处理代理之前要做的事情
        realProduct.show();
        post();         //代理增强方法，处理代理之后要做的事情
    }

    public void pre(){
        System.out.println("代理之前要做的事情");
    }

    public void post(){
        System.out.println("代理之后要做的事情");
    }
}
