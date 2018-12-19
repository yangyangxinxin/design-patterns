package link.yangxin.design.pattern.factory.abstractfactory;

/**
 * @author yangxin
 * @date 2018/11/16
 */
public class RedDress extends Dress {

    @Override
    public float getPrice() {
        System.out.println("红色裙子的价格为200元");
        return 200F;
    }
}