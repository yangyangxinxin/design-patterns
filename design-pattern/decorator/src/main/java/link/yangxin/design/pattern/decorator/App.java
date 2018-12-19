package link.yangxin.design.pattern.decorator;

/**
 * @author yangxin
 * @date 2018/11/19
 */
public class App {

    public static void main(String[] args) {
        // 普通的裙子
        Goods goods = new Dress();
        System.out.printf("名称：%s,价格：%f \n", goods.getName(), goods.getPrice());

        // 限量版连衣裙
        LimitDress limitDress = new LimitDress(goods);
        System.out.printf("名称：%s,价格：%f", limitDress.getName(), limitDress.getPrice());

    }

}