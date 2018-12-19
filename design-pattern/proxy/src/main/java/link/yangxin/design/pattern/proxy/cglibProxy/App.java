package link.yangxin.design.pattern.proxy.cglibProxy;


import link.yangxin.design.pattern.proxy.staticProxy.Person;

/**
 * @author yangxin
 * @date 2018/11/19
 */
public class App {

    public static void main(String[] args) {
        PersonCglibProxy proxy = new PersonCglibProxy(new Person());
        Person proxyInstance = (Person) proxy.getProxyInstance();
        proxyInstance.eat();
        proxyInstance.drink();
    }

}