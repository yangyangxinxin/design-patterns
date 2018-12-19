package link.yangxin.design.pattern.proxy.staticProxy;

import link.yangxin.design.pattern.proxy.IPerson;

/**
 * @author yangxin
 * @date 2018/11/19
 */
public class Person implements IPerson {
    @Override
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public void drink() {
        System.out.println("喝水");
    }
}