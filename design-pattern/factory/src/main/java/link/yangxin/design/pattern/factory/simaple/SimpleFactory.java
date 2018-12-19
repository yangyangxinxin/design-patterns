package link.yangxin.design.pattern.factory.simaple;

import link.yangxin.design.pattern.factory.Goods;

/**
 * 简单（静态）工厂
 *
 * 缺点： 耦合度较高
 * 当新增"产品"种类时，需要修改此类，不符合"开放-关闭原则"
 *
 * @author yangxin
 * @date 2018/11/16
 */
public class SimpleFactory {

    public static Goods getGoods(String type) {
        if ("jeans".equalsIgnoreCase(type)) {
            return new Jeans();
        } else if ("shoe".equalsIgnoreCase(type)) {
            return new Shoe();
        } else {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        System.out.println(SimpleFactory.getGoods("jeans").getPrice());
        System.out.println(SimpleFactory.getGoods("shoe").getPrice());
    }

}