import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHasgMap {
    public static void main(String[] args) {
//        Map<String, Integer> lmap = new LinkedHashMap<>();
        Map<String, tch> lmap = new LinkedHashMap<>();
        tch tch = new tch(1, "a", "it");
        tch tch1 = new tch(2, "aa", "it.");
        tch tch2 = new tch(1, "a", "it");

        lmap.put("a", tch);
        lmap.put("b", tch1);
        lmap.put("c", tch2);

        for (Map.Entry t:lmap.entrySet()){
            System.out.println(t.getKey() + "" + t.toString());
        }


//        lmap.put("a", 5);
//        lmap.put("v", 5);
//        lmap.put("b", 5);
//        lmap.put("d", 5);
//
//        for (Map.Entry m:lmap.entrySet()){
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
    }
}
