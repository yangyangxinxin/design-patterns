package link.yangxin.design.pattern.adapter;

/**
 * @author yangxin
 * @date 2018/11/19
 */
public class Old implements IOld {
    @Override
    public String getOld() {
        return "适配了old接口！";
    }
}