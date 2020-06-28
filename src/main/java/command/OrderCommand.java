package command;

/**
 * 命令实现
 *
 * @author Zx
 * @date 2020/6/28 20:41
 * @modified By:
 */
public class OrderCommand implements ICommand {
    private Operator receiver;
    private Order order;

    //传入两个参数,一个是执行者,一个是执行的目标
    public OrderCommand(Operator receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getId() + "号顾客的成品");
        receiver.markFruit(order);
    }
}
