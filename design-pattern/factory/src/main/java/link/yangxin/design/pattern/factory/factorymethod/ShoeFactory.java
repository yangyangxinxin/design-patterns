package link.yangxin.design.pattern.factory.factorymethod;

import link.yangxin.design.pattern.factory.Goods;
import link.yangxin.design.pattern.factory.simaple.Shoe;

/**
 * @author yangxin
 * @date 2018/11/16
 */
public class ShoeFactory implements GoodsFactory {
    @Override
    public Goods getGoods() {
        return new Shoe();
    }
}