package link.yangxin.design.pattern.factory.abstractfactory;

/**
 * @author yangxin
 * @date 2018/11/16
 */
public class RedShirt extends Shirt {

    @Override
    public float getPrice() {
        System.out.println("红色T-shirt的价格为80元");
        return 80F;
    }
}