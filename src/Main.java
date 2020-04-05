import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Plant> items = new HashMap<>();
        int i = 0;

        items.put(i, new Plant(
                "carrot", 5
        ));

        items.put(++i, new Plant(
                "kale", 8
        ));

        Set<Integer> keys = items.keySet();
        for (int key :
                keys) {
            System.out.println(items.get(key).getName());
        }

    }
}
