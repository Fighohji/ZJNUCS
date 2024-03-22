package Ex11_2;

public class Person {
    private String name, address, phoneNumber, eMail;
    public Person() { }
    public Person(String name, String address, String phoneNumber, String eMail) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", eMail=" + eMail
                + "]";
    }
}
