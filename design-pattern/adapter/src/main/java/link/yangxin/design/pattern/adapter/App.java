package link.yangxin.design.pattern.adapter;

/**
 * 适配器模式
 *
 * @author yangxin
 * @date 2018/11/19
 */
public class App {

    public static void main(String[] args) {
        INew iNew = new NewAdapter();
        System.out.println(iNew.getNew());
        System.out.println(((NewAdapter) iNew).getOld());

        iNew = new NewAdatper2(new Old());
        System.out.println(iNew.getNew());
        System.out.println(((NewAdatper2) iNew).getOld());
    }

}