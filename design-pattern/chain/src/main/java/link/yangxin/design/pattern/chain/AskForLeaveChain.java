package link.yangxin.design.pattern.chain;

/**
 * @author yangxin
 * @date 2019/10/16
 */
public abstract class AskForLeaveChain {

    private AskForLeaveChain next;

    public final void doChain(int leaveDay){
        boolean ask = ask(leaveDay);
        if (next != null && !ask) {
            next.doChain(leaveDay);
        }
    }

    public abstract boolean ask(int leaveDay);

    public AskForLeaveChain getNext() {
        return next;
    }

    public void setNext(AskForLeaveChain next) {
        this.next = next;
    }
}