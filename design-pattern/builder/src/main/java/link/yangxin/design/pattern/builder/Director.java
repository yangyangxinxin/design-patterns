package link.yangxin.design.pattern.builder;

/**
 * 指挥者
 * @author yangxin
 * @date 2018/11/16
 */
public class Director {

    public void build(IBuilder builder) {
        // 开始组装
        builder.createJacket();
        builder.createPants();
        System.out.println(">>>>>>>>>组装完成，套装发货！");
    }

}