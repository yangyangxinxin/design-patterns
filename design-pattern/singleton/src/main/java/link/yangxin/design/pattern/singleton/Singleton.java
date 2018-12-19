package link.yangxin.design.pattern.singleton;

/**
 * 单例模式 饿汉式 类被加载时实例化对象
 *
 * @author yangxin
 * @date 2018/11/16
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Singleton.getInstance().hashCode());
            }).start();
        }

    }
}
