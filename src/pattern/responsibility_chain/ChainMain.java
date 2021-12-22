package pattern.responsibility_chain;


/**
 * @author wangyu
 * @date 2021/12/22 20:15
 */
public class ChainMain {
    public static void main(String[] args) {
        Handler A = new AHandler();
        Handler B = new BHandler();
        Handler C = new CHandler();

        A.setNextHandler(B);
        B.setNextHandler(C);

        A.handle("A");
        A.handle("B");
        A.handle("C");
        A.handle("D");

    }
}
