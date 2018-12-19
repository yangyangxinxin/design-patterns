package link.yangxin.design.pattern.factory.abstractfactory;

import link.yangxin.design.pattern.factory.simaple.Jeans;

/**
 * @author yangxin
 * @date 2018/11/16
 */
public class BlackShirt extends Shirt {

    @Override
    public float getPrice() {
        System.out.println("黑色T-shirt的价格是100元");
        return 100F;
    }

}