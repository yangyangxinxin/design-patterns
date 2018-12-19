package link.yangxin.design.pattern.factory.abstractfactory;

/**
 * 红色颜色工厂
 * @author yangxin
 * @date 2018/11/16
 */
public class RedFactory extends AbstractFactory {
    @Override
    public Dress getDress() {
        return new RedDress();
    }

    @Override
    public Shirt getShirt() {
        return new RedShirt();
    }

}