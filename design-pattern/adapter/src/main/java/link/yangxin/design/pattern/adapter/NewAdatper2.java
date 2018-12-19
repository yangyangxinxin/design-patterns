package link.yangxin.design.pattern.adapter;

/**
 * @author yangxin
 * @date 2018/11/19
 */
public class NewAdatper2 extends Old implements INew {

    private Old old;

    public NewAdatper2(Old old) {
        this.old = old;
    }

    @Override
    public String getNew() {
        return "适配了新的接口！";
    }
}