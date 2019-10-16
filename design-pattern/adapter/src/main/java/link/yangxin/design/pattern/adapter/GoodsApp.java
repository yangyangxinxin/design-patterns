package link.yangxin.design.pattern.adapter;

/**
 * @author yangxin
 * @date 2019/4/15
 */
public class GoodsApp implements Runnable {

    public static int goodsCount = 100;

    private String name;

    private Integer count;

    public GoodsApp(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public void run() {
        if (count > goodsCount) {
            System.out.println("===不能再买了，商品卖完了====");
            return;
        }
        goodsCount = goodsCount - count;
        System.out.println(name + "购买了" + count + "个商品，现在剩余" + goodsCount + "个商品。");
    }


    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            Thread thread = new Thread(new GoodsApp("yangxin" + i, 10));
            thread.start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


}