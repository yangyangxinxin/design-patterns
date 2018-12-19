package link.yangxin.design.pattern.proxy.dynamicProxy;

import lombok.AllArgsConstructor;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * 此类中大部分代码都是套路，不同的代理类，只需要修改invoke方法的内容即可。
 * @author yangxin
 * @date 2018/11/19
 */
@AllArgsConstructor
public class PersonDynamicProxy {

    private Object target;

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("做饭");
            Object o = method.invoke(target, args);
            System.out.println("洗碗");
            return o;
        });
    }

}