package link.yangxin.design.pattern.chain;

/**
 * @author yangxin
 * @date 2019/10/16
 */
public class App {

    public static void main(String[] args) {
        GroupManager groupManager = new GroupManager("杨鑫");
        ProjectManger projectManger = new ProjectManger("许源渊");
        Boss boss = new Boss();

        groupManager.setNext(projectManger);
        projectManger.setNext(boss);

        groupManager.doChain(40);

    }

}