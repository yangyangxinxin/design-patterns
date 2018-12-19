package link.yangxin.design.pattern.singleton;

/**
 * 懒汉式-双重锁
 * 线程安全适用高并发 推荐
 *
 * @author yangxin
 * @date 2018/11/16
 */
public class SingletonLock {

    private static SingletonLock instance;

    private SingletonLock() {
    }

    /**
     * 注意 synchronized 不在方法上，而在if里面，这样只有第一次才进行同步，之后的每次调用因为已经有对象，则不会再进入同步方法中
     * 高并发的场景下，又要使用懒汉式，则推荐使用 此方法
     */
    public static SingletonLock getInstance() {
        if (instance == null) {
            synchronized (SingletonLock.class) {
                instance = new SingletonLock();
            }
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
                System.out.println(SingletonLock.getInstance().hashCode());
            }).start();
        }
    }
}