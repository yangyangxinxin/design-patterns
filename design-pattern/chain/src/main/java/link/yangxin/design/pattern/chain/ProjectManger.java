package link.yangxin.design.pattern.chain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author yangxin
 * @date 2019/10/16
 */
@AllArgsConstructor
@NoArgsConstructor
public class ProjectManger extends AskForLeaveChain {

    private String name;

    @Override
    public boolean ask(int leaveDay) {
        if (leaveDay >= 1 && leaveDay <= 3) {
            System.out.println(name + "说：你就请" + leaveDay + "天假，作为项目经理就直接给你通过了");
            return true;
        }
        System.out.println(name + "说：你请" + leaveDay + "天假，作为项目经理批了还不行，你得再找BOSS审批");
        return false;
    }
}