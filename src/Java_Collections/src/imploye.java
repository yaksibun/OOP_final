import java.util.Objects;
public class imploye {
    private int id;
    private String name;
    private String work;

    public imploye(int id, String name, String work) {
        this.id = id;
        this.name = name;
        this.work = work;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        imploye imploye = (imploye) o;
        return id == imploye.id &&
                Objects.equals(name, imploye.name) &&
                Objects.equals(work, imploye.work);
    }

    public int hashCode() {
        return Objects.hash(id, name, work);
    }
}
