package link.yangxin.design.pattern.factory.abstractfactory;

import link.yangxin.design.pattern.factory.Goods;

/**
 * T-shirt
 * @author yangxin
 * @date 2018/11/16
 */
public abstract class Shirt extends Goods {
    @Override
    public float getPrice() {
        return 100F;
    }
}