package link.yangxin.design.pattern.proxy.staticProxy;

/**
 * @author yangxin
 * @date 2018/11/19
 */
public class App {

    public static void main(String[] args) {
        PersonStaticProxy proxy = new PersonStaticProxy(new Person());
        proxy.eat();
    }

}