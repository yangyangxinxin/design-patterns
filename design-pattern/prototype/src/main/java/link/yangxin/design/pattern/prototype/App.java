package link.yangxin.design.pattern.prototype;

import lombok.val;

/**
 * @author yangxin
 * @date 2018/11/19
 */
public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        val entity = new Entity("yangxin");
        Entity demo;

        int i = 0;
        while (i < 10) {
            demo = entity.clone();
            demo.setId("" + i);
            demo.setName("yangxin" + i);
            System.out.println(demo);
            i++;
        }
    }

}