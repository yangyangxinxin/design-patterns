package link.yangxin.design.pattern.decorator;

/**
 * 连衣裙
 *
 * @author yangxin
 * @date 2018/11/19
 */
public class Dress extends Goods {
    @Override
    public String getName() {
        return "裙子";
    }

    @Override
    public double getPrice() {
        return 200;
    }
}