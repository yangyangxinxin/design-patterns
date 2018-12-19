package link.yangxin.design.pattern.builder;

/**
 * 红色建造者【具体建造者】
 * @author yangxin
 * @date 2018/11/16
 */
public class ProductRedBuilder implements IBuilder {

    private Product product = new Product();

    @Override
    public void createJacket() {
        product.setJacket(new Jacket("红色上衣"));
        System.out.println(">>>>>>>>红色上衣提取完成！");
    }

    @Override
    public void createPants() {
        product.setPants(new Pants("红色裤子"));
        System.out.println(">>>>>>>>红色裤子提取完成！");
    }

    @Override
    public Product getProducts() {
        return product;
    }
}