import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "i");
        map.put(null, "i");
        map.put(null, "I");
        map.put(3, "d");
        map.put(3, "D");
        map.put(3, "DD");
        map.put(4, "b");
        System.out.println(map);
        for (Map.Entry m: map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
