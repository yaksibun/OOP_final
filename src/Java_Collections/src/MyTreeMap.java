import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> treemp = new TreeMap<>();
        treemp.put(1, "a");
        treemp.put(5, "a");
        treemp.put(2, "a");
        treemp.put(2, null);
        treemp.put(14, "a");

        System.out.println(treemp.size());

        for (Map.Entry tm:treemp.entrySet()){
            System.out.println(tm.getKey() + " " + tm.getValue());
        }
    }
}
