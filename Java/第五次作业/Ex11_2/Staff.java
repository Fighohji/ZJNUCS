package Ex11_2;

import java.util.Date;

public class Staff extends Employee {
    private String title;
    public Staff() {}
    public Staff(String name, String address, String phoneNumber, String eMail, String office, double salary,
            Date hired, String title) {
        super(name, address, phoneNumber, eMail, office, salary, hired);
        this.title = title;
    }
    @Override
    public String toString() {
        return "Staff [title=" + title + "], [name=]" + getName() +"]";
    }
}
