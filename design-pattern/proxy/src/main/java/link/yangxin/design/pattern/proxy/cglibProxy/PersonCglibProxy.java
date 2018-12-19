package link.yangxin.design.pattern.proxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yangxin
 * @date 2018/11/19
 */
public class PersonCglibProxy implements MethodInterceptor {

    private Object target;

    public PersonCglibProxy(Object target) {
        this.target = target;
    }

    /**
     * 创建代理对象
     */
    public Object getProxyInstance() {
        // cglib 的代理工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调方法
        enhancer.setCallback(this);
        //创建子类对象
        return enhancer.create();
    }

    /**
     * 实现接口的拦截方法
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("做饭");
        Object object = method.invoke(target, objects);
        System.out.println("洗碗");
        return object;
    }
}