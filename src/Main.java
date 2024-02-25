import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account person1 = new Account("marios", 01, 4000);
        Account person2 = new Account("john", 02, 20);
        Account person3 = new Account("nikos", 03, 10000);
        Account person4 = new Account("eirini", 04, 5);

        //first scanner for id
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your ID: ");
        int personID = scanner.nextInt();

        //Second Scanner for amount that you deposit
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter the amount of money you want to deposit: ");
        int deposited = scanner1.nextInt();
        person1.deposit(deposited);

    }
}
