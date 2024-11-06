import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MyLinkedHashSet {
    public static void main(String[] args) {
        Set<String> linkedset = new LinkedHashSet<>();

        linkedset.add("A");
        linkedset.add("h");
        linkedset.add("b");
        linkedset.add("C");
        linkedset.add("D");
        linkedset.add("e");

        for (String string : linkedset){
            System.out.println(string);
        }

        List<String> list = new ArrayList<>(linkedset);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index: " + i + ", Element: " + list.get(i));
        }
    }
}
