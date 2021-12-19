package pattern.builder;

/**
 * @author wangyu
 * @date 2021/12/19 13:00
 */
//电脑类
public class Computer {
    private String mainFrame;   //主机
    private String display;     //显示器
    private String keyboard;     //键鼠套装

    public void setMainFrame(String mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void showMessage(){
        System.out.println("这是一台电脑。");
    }
}
