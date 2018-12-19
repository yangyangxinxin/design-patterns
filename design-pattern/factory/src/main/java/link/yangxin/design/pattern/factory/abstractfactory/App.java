package link.yangxin.design.pattern.factory.abstractfactory;

/**
 * @author yangxin
 * @date 2018/11/16
 */
public class App {

    public static void main(String[] args) {
        AbstractFactory factory = new BlackFactory();
        System.out.println(factory.getDress().getPrice());
        System.out.println(factory.getShirt().getPrice());

        factory = new RedFactory();
        System.out.println(factory.getDress().getPrice());
        System.out.println(factory.getShirt().getPrice());


    }

}