package Ex9_7;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterstRate;
    private Date dateCreated;
    public Account() {
        id = 0;
        balance = 0;
        annualInterstRate = 0;
        dateCreated = new Date();
    }
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterstRate = 0;
        dateCreated = new Date();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterstRate() {
        return annualInterstRate;
    }
    public void setAnnualInterstRate(double annualInterstRate) {
        this.annualInterstRate = annualInterstRate / 100;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate() {
        return annualInterstRate / 12;
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    public boolean withDraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public double deposit(double amonut) {
        return balance += amonut;
    }
}
