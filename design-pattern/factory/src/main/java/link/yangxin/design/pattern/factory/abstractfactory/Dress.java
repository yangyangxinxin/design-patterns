package link.yangxin.design.pattern.factory.abstractfactory;

import link.yangxin.design.pattern.factory.Goods;

/**
 * 裙子
 * @author yangxin
 * @date 2018/11/16
 */
public abstract class Dress extends Goods {
    @Override
    public float getPrice() {
        return 300F;
    }
}