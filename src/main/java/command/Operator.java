package command;

/**
 * receiver 接收者
 * <p>
 * 真正的命令执行对象
 *
 * @author Zx
 * @date 2020/6/28 20:45
 * @modified By:
 */
public class Operator {
    public void markFruit(Order order) {

        String str = "";
        for (String key : order.getFruitMap().keySet()) {
            str += key + order.getFruitMap().get(key).toString() + "--";
        }
        System.out.println("这是您的果汁:" + str);
    }
}
