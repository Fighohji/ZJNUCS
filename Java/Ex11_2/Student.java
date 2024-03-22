package Ex11_2;

public class Student extends Person {
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    private int grade;
    public Student() { }

    public Student(String name, String address, String phoneNumber, String eMail, int grade) {
        super(name, address, phoneNumber, eMail);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [grade=" + grade + "], [name=" + super.getName()+"]";
    }
    
    
}
