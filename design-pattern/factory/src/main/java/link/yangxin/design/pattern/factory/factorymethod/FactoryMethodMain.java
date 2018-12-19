package link.yangxin.design.pattern.factory.factorymethod;

/**
 * 工厂方法模式
 * @author yangxin
 * @date 2018/11/16
 */
public class FactoryMethodMain {

    public static void main(String[] args) {
        GoodsFactory factory = new JeansFactory();
        System.out.println(factory.getGoods().getPrice());

        factory = new ShoeFactory();
        System.out.println(factory.getGoods().getPrice());
    }

}