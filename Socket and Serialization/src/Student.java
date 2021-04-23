import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int stAvg;

    public Student(String name, int stAvg) {
        this.name = name;
        this.stAvg = stAvg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStAvg() {
        return stAvg;
    }

    public void setStAvg(int stAvg) {
        this.stAvg = stAvg;
    }
}
