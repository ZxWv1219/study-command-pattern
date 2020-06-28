import command.*;

/**
 * @author Zx
 * @date 2020/6/28 21:33
 * @modified By:
 */
public class Run {
    public static void main(String[] args) {
        //创建订单
        Order order1 = new Order()
                .setId("1")
                .setFruitMap("西瓜", 1)
                .setFruitMap("哈密瓜", 2);
        Order order2 = new Order()
                .setId("2")
                .setFruitMap("苹果", 3)
                .setFruitMap("橙子", 2);

        Operator operator = new Operator();
        ICommand command1 = new OrderCommand(operator, order1);
        ICommand command2 = new OrderCommand(operator, order2);
        WaiterInvoker waiterInvoker = new WaiterInvoker();
        waiterInvoker.setCommands(command1);
        waiterInvoker.setCommands(command2);

        waiterInvoker.orderUp();
    }
}
