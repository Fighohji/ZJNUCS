package Ex11_2;

import java.util.Date;

public class Faculty extends Employee {
    public static final int JUNIOR = 1;
    public static final int SENIOR = 2;
    private Date officeTime;
    private int level;
    public Faculty() {}
    public Faculty(String name, String address, String phoneNumber, String eMail, String office, double salary,
            Date hired, Date officeTime, int level) {
        super(name, address, phoneNumber, eMail, office, salary, hired);
        this.officeTime = officeTime;
        this.level = level;
    }
    @Override
    public String toString() {
        return "Faculty [officeTime=" + officeTime + "], [name=" + getName() + "]";
    }
}
