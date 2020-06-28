package command;

import java.util.ArrayList;

/**
 * Invoker 调用者,执行者
 * <p>
 * 使用命令对象的入口
 *
 * @author Zx
 * @date 2020/6/28 21:04
 * @modified By:
 */
public class WaiterInvoker {
    private ArrayList<ICommand> commands = null;

    public WaiterInvoker() {
        commands = new ArrayList<>();
    }

    public void setCommands(ICommand cmd) {
        this.commands.add(cmd);
    }

    public void orderUp() {
        System.out.println("有订单");
        for (ICommand cmd : commands) {
            if (cmd != null) cmd.execute();
        }
    }
}
