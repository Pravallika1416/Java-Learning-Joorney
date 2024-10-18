package comparatorpractice;

public class Comparsion implements Comparable<Comparsion>{

    String name;
    Integer rollno;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Comparsion{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    public Comparsion(String name, Integer rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    @Override
    public int compareTo(Comparsion o) {
        return Integer.compare(this.getRollno(),o.getRollno());
    }
}
