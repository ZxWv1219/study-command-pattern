package command;

import java.util.HashMap;

/**
 *
 * @author Zx
 * @date 2020/6/28 20:45
 * @modified By:
 */
public class Order {
    private String id;

    private HashMap<String, Integer> fruitMap;

    public Order() {
        fruitMap = new HashMap<>();
    }

    public String getId() {
        return this.id;
    }

    public Order setId(String id) {
        this.id = id;
        return this;
    }

    public HashMap<String, Integer> getFruitMap() {
        return fruitMap;
    }

    public Order setFruitMap(String fruitName, int num) {
        this.fruitMap.put(fruitName, num);
        return this;
    }
}
