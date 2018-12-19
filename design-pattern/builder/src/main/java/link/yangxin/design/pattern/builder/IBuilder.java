package link.yangxin.design.pattern.builder;

/**
 * 建造者的公共接口
 * 建造者公共接口包含两类方法，分别是具体的模块的创建方法，以及获取最终的产品对象的方法
 * @author yangxin
 * @date 2018/11/16
 */
public interface IBuilder {

    /**
     * 取出上衣
     */
    void createJacket();

    /**
     * 取出裤子
     */
    void createPants();

    /**
     * 套装
     * @return
     */
    Product getProducts();

}
