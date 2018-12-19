package link.yangxin.design.pattern.singleton;

/**
 * 单例：懒汉式 即类加载时没有实例化，调用取得实例的方法getInstance()的时候才实例化对象
 * 不推荐 线程不安全
 *
 * @author yangxin
 * @date 2018/11/16
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    /**
     * 如果不加synchronized 线程不安全 但是每次都是同步方法效率会降低
     *
     * @return
     */
    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(SingletonLazy.getInstance().hashCode());
            }).start();
        }

    }
}