import java.util.ArrayList;

public class My_arraylist {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("salom");
//        list.add("bugun");
//        list.add("havo");
//        list.add("qanday");

//        for (int i = 0; i < list.size() ; i++) {
//            System.out.println(list.get(i));
//        }

//        for (String s : list) {
//            System.out.println(s);
//        }
//        Collections.sort(list);   //alfabit boyicha sortlaydi
//        list.remove("salom");     //o'chirib beradi
//        list.forEach(string -> {
//            System.out.println(string);
//        });

        ArrayList<Student> list1 = new ArrayList<>();

        Student student = new Student(1L, "test", "best");
        Student student1 = new Student(2L, "test1", "best1");
        Student student2 = new Student(3L, "test1", "best1");
        Student student3 = new Student(4L, "test1", "best1");

        list1.add(student);
        list1.add(student1);
        list1.add(student2);
        list1.add(student3);

        list1.forEach(item -> {
            System.out.println(item.getId());
            System.out.println(item.getName());
            System.out.println(item.getLastname());
        });
    }
}
