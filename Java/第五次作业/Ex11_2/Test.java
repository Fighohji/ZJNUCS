package Ex11_2;

import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Person person = new Person("a", "b", "c", "d");
        Student student = new Student("aa", "ff", "gg", "hh", Student.SOPHOMORE);
        Employee employee = new Employee("ba", "dw", "ead", "weqe", "eqwdw", 1231, new Date());
        Faculty faculty = new Faculty("fac", "Weqw", "EWqwd", "wdq", "wfq", 10, new Date(), new Date(2024), Faculty.SENIOR);
        Staff staff = new Staff("eqwd", "cavg", "sdv", "gewg", "grerg", 2319, new Date(), "weqqwfegw");
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
}
