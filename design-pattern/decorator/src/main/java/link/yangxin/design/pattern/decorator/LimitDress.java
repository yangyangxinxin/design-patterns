package link.yangxin.design.pattern.decorator;

/**
 * 限量版连衣裙 装饰者
 * @author yangxin
 * @date 2018/11/19
 */
public class LimitDress extends Goods{

    private Goods goods;

    public LimitDress(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String getName() {
        return "限量版" + goods.getName();
    }

    @Override
    public double getPrice() {
        return 200 + goods.getPrice();
    }
}