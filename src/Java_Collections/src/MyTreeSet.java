import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(5);
        tree.add(6);
        tree.add(6);
        tree.add(8);
        tree.add(15);
        tree.add(5);
        System.out.println(tree);
        System.out.println(tree.pollFirst());
        System.out.println(tree.pollLast());

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("g");
        hashSet.add("h");
        hashSet.add("b");
        System.out.println(hashSet);
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);  // tariblab chiqradi
        System.out.println(treeSet.descendingSet()); // teskari chiqaradi

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()); // bu java 7 gacha bo'lgan usul 7 dan kegin foreach
        // bu yangi usul
        hashSet.forEach(ss ->{
            System.out.println("foreach " + ss);
        });
        }
    }
}
