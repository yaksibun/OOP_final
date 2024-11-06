import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
//        HashSet<imploye> set = new HashSet<>();
        Set<imploye> set = new HashSet<>();

        imploye imploye = new imploye(1, "a", "aa");
        imploye imploye1 = new imploye(2, "b", "bb");
        imploye imploye5 = new imploye(2, "b", "bb");
        imploye imploye2 = new imploye(3, "c", "cc");
        imploye imploye3 = new imploye(1, "a", "aa");
        imploye imploye4 = new imploye(1, "a", "aa");

        set.add(imploye);
        set.add(imploye1);
        set.add(imploye2);
        set.add(imploye3);
        set.add(imploye4);
        set.add(imploye5);


        set.forEach(st -> {
            System.out.println(st.getId());
            System.out.println(st.getName());
            System.out.println(st.getWork());
        });

    }
}
