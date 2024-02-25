public class Account {
    String name;
    int accID;
    int balance;

    public Account(String name, int accID, int balance) {
        this.name = name;
        this.accID = accID;
        this.balance = balance;
    }

    public void results() {
        System.out.println("The name is " + name + ", the account ID is " + accID +
                ", and the balance of this account is " + balance + " euros");
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("The amount you deposited was " + amount +
                " and the new balance after your deposit is: " + balance);
    }
    public void erning(int take) {
        balance -= take;
        System.out.println("Your total amount you have after the withdrawal is " + balance +", and you took "+ take + " euros");

    }
}


