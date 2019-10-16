package link.yangxin.design.pattern.chain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author yangxin
 * @date 2019/10/16
 */
@AllArgsConstructor
@NoArgsConstructor
public class GroupManager extends AskForLeaveChain {

    private String name;

    @Override
    public boolean ask(int leaveDay) {
        if (leaveDay <= 1) {
            System.out.println(name + "说：你就请" + leaveDay + "天假，作为组长就直接给你通过了");
            return true;
        }
        System.out.println(name + "说：你请" + leaveDay + "天假，作为组长批了还不行，你得再找项目经理审批");
        return false;
    }
}