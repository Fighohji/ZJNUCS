package Ex11_2;

import java.util.Date;

public class Employee extends Person {
    private String office;
    private double salary;
    private Date hired;
    public Employee() {}
    public Employee(String name, String address, String phoneNumber, String eMail, String office, double salary,
            Date hired) {
        super(name, address, phoneNumber, eMail);
        this.office = office;
        this.salary = salary;
        this.hired = hired;
    }

    @Override
    public String toString() {
        return "Employee [office=" + office + ", salary=" + salary + ", hired=" + hired + "]";
    }
}
