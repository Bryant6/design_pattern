package pattern.responsibility_chain;

/**
 * @author wangyu
 * @date 2021/12/22 20:09
 */
//处理者A
public class AHandler extends Handler {
    @Override
    public void handle(String request) {
        if (request.equals("A")){
            System.out.println("A号处理者处理了这个问题");
        }else{
            if (this.getNextHandler() != null){
                this.getNextHandler().handle(request);
            }else{
                System.out.println("这个问题没有人处理");
            }
        }
    }
}
