package Test.Test05;

public class BankSystem {
    public static void main(String[] args) {
        Account a1 = new Account("2001", 2000);
        Account a2 = new Account("2002", 3000);
        Account a3 = new Account("2003", 3000);

        System.out.println();

    }
}

class Account{
    public static int account = 100;
    private String password;
    private double wage;
    private static double min_wage = 0;

    public Account(String password, double wage) {
        this.account += 1;
        this.password = password;
        this.wage = wage;
    }

}
