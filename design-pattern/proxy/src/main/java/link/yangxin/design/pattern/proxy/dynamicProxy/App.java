package link.yangxin.design.pattern.proxy.dynamicProxy;

import link.yangxin.design.pattern.proxy.IPerson;
import link.yangxin.design.pattern.proxy.staticProxy.Person;

/**
 * @author yangxin
 * @date 2018/11/19
 */
public class App {

    public static void main(String[] args) {
        PersonDynamicProxy proxy = new PersonDynamicProxy(new Person());
        IPerson proxyInstance = (IPerson) proxy.getProxyInstance();
        System.out.println(proxyInstance.getClass());
        proxyInstance.eat();
        proxyInstance.drink();
    }

}