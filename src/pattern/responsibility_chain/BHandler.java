package pattern.responsibility_chain;

/**
 * @author wangyu
 * @date 2021/12/22 20:09
 */
//处理者B
public class BHandler extends Handler {
    @Override
    public void handle(String request) {
        if (request.equals("B")){
            System.out.println("B号处理者处理了这个问题");
        }else{
            if (this.getNextHandler() != null){
                this.getNextHandler().handle(request);
            }else{
                System.out.println("这个问题没有人处理");
            }
        }
    }
}
