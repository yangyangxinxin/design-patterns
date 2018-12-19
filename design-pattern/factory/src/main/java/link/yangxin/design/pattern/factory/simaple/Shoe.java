package link.yangxin.design.pattern.factory.simaple;

import link.yangxin.design.pattern.factory.Goods;

/**
 * @author yangxin
 * @date 2018/11/16
 */
public class Shoe extends Goods {
    @Override
    public float getPrice() {
        System.out.println("鞋子的价格为800.00元");
        return 800.00F;
    }
}