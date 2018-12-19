package link.yangxin.design.pattern.builder;

/**
 * @author yangxin
 * @date 2018/11/16
 */
public class ProductBlackBuilder implements IBuilder {

    private Product product = new Product();

    @Override
    public void createJacket() {
        System.out.println(">>>>>>>>>>>黑色上衣提货完成！");
        product.setJacket(new Jacket("黑色上衣"));
    }

    @Override
    public void createPants() {
        System.out.println(">>>>>>>>>>>黑色裤子提货完成！");
        product.setPants(new Pants("黑色裤子"));
    }

    @Override
    public Product getProducts() {
        return product;
    }
}