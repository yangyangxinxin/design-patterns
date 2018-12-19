package link.yangxin.design.pattern.factory.factorymethod;

import link.yangxin.design.pattern.factory.Goods;

/**
 * 商品工厂，不同的商品实现这个接口就可以
 *
 * @author yangxin
 * @date 2018/11/16
 */
public interface GoodsFactory {

    Goods getGoods();

}
