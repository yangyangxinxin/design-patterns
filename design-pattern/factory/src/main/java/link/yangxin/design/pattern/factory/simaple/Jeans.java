package link.yangxin.design.pattern.factory.simaple;

import link.yangxin.design.pattern.factory.Goods;

/**
 * 牛仔裤
 * @author yangxin
 * @date 2018/11/16
 */
public class Jeans extends Goods {
    @Override
    public float getPrice() {
        System.out.println("牛仔裤的价格为300.00元");
        return 300.0F;
    }
}