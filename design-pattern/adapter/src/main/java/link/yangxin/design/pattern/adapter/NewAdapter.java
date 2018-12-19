package link.yangxin.design.pattern.adapter;

/**
 * 继承想要使用的类，实现想要使用的接口
 * @author yangxin
 * @date 2018/11/19
 */
public class NewAdapter extends Old implements INew {
    @Override
    public String getNew() {
        return "适配了新的接口！";
    }
}