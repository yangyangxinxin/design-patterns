package link.yangxin.design.pattern.factory.abstractfactory;

/**
 * @author yangxin
 * @date 2018/11/16
 */
public class BlackDress extends Dress {

    @Override
    public float getPrice() {
        System.out.println("黑色裙子的价格为100元");
        return 100F;
    }
}