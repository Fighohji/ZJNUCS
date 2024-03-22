package Ex9_7;

public class Ex9_7 {
    public static void main(String[] args) {
        Account client = new Account(1122, 20000);
        client.setAnnualInterstRate(4.5);
        client.withDraw(2500);
        client.deposit(3000);
        System.out.println(String.format("The balance is %f, monthlyInterestRate is %f, created date is %s",
                                         client.getBalance(), client.getMonthlyInterest(), client.getDateCreated().toString()));
    }
}
