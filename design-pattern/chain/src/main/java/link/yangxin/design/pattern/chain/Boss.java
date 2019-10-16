package link.yangxin.design.pattern.chain;

/**
 * @author yangxin
 * @date 2019/10/16
 */
public class Boss extends AskForLeaveChain {

    @Override
    public boolean ask(int leaveDay) {
        if (leaveDay >= 3 && leaveDay <= 20) {
            System.out.println("老板说：好，请" + leaveDay + "天假，boss就给你审批通过了");
            return true;
        }
        System.out.println("老板说：卧槽，请这么长时间，回去继续搬砖");
        return false;
    }
}