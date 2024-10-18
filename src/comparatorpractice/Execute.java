package comparatorpractice;

import java.util.Arrays;

public class Execute {
    public static void main(String args[]) {
        Comparsion arr[] = {new Comparsion("ram", 203), new Comparsion("pravalliia", 101),

                new Comparsion("Teja", 306), new Comparsion("Eeka", 200),};
        StudentComparator stud[] = {new StudentComparator("ram", "203"), new StudentComparator("pravalliia", "" +
                "" +
                "" +
                "101"),

                new StudentComparator("Teja", "306"), new StudentComparator("Eeka", "200"),};
Arrays.sort(arr);
        Arrays.sort(stud, new StudentComparator("", ""));
        System.out.println(Arrays.toString(arr));;
        System.out.println(Arrays.toString(stud));;
    }
}


