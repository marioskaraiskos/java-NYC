import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account person1 = new Account("marios", 01, 4000);
        Account person2 = new Account("john", 02, 20);
        Account person3 = new Account("nikos", 03, 10000);
        Account person4 = new Account("eirini", 04, 5);
        Account selectedPerson = null;
        //first scanner for id
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your ID: ");
        int personID = scanner.nextInt();
        if (personID == 01) {
            selectedPerson = person1;
        }
        else if (personID == 02) {
            selectedPerson = person2;
        } else if (personID == 03) {
            selectedPerson = person3;
        }
        else if (personID == 04) {
            selectedPerson = person4;
        }
        else {
            System.out.println("You didnt gave a correct accID.");
        }

        //Second Scanner for amount that you deposit
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter the amount of money you want to deposit: ");
        int deposited = scanner1.nextInt();
        selectedPerson.deposit(deposited);

        //third scanner for earning money
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("enter the amount of money you want to earn: ");
        int earn = scanner2.nextInt();
        selectedPerson.erning(earn);

    }
}


