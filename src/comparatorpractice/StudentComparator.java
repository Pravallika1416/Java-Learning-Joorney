package comparatorpractice;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentComparator> {
    public StudentComparator(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    String name;
    String rollno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    @Override
    public String toString() {
        return "StudentComparator{" +
                "name='" + name + '\'' +
                ", rollno='" + rollno + '\'' +
                '}';
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    @Override
    public int compare(StudentComparator o1, StudentComparator o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
