
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Islom", "Uzbekistan");
        System.out.println(person.toString());

        Student student = new Student("Jasur", "Toshkent", "PHP", 2001, 5);
        System.out.println(student.toString());

        Staff staff = new Staff("Nick", "Monhetton", "street 77", 8);
        System.out.println(staff.toString());
    }
}