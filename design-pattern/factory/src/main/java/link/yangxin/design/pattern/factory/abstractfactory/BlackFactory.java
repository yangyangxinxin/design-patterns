package link.yangxin.design.pattern.factory.abstractfactory;

/**
 * 黑色着色工厂
 * @author yangxin
 * @date 2018/11/16
 */
public class BlackFactory extends AbstractFactory {
    @Override
    public Dress getDress() {
        return new BlackDress();
    }

    @Override
    public Shirt getShirt() {
        return new BlackShirt();
    }

}