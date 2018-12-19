package link.yangxin.design.pattern.proxy.staticProxy;

import link.yangxin.design.pattern.proxy.IPerson;
import lombok.AllArgsConstructor;

/**
 * 静态代理
 * 这里可以发现，静态代理需要实现原接口，这样就带来一个弊端
 * 当原接口添加新的方法时，代理类也需要进行修改。
 *
 * @author yangxin
 * @date 2018/11/19
 */
@AllArgsConstructor
public class PersonStaticProxy implements IPerson {

    private Person person;

    @Override
    public void eat() {
        System.out.println("开始吃饭");
        person.eat();
        System.out.println("洗碗");
    }

    @Override
    public void drink() {

    }
}