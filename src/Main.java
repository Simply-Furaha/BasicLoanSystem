import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Official Names: ");
        String names = scanner.nextLine();
        System.out.println("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.println("Enter Your Monthly income: ");
        double income = scanner.nextDouble();
        if (age >= 18 && age <= 34 && income > 10000) {
            System.out.println("Hello " + names + "You Qualify for the followwing loans:/n 1. Youth,/n 2. Hustler,/n 3. Biashara");
            System.out.println("Select the loan you want to apply for(1,2,3): ");
            int loan = scanner.nextInt();
            if (loan == 1) {
                System.out.println("You have been approved for the Youth loan");
            } else if (loan == 2) {
                System.out.println("You have been approved for the Hustler loan");
            } else if (loan == 3) {
                System.out.println("You have been approved for the Biashara loan");
            } else {
                System.out.println("Invalid loan selection");
            }
        }
        if (age > 35 && age <= 44 && income > 100000) {
            System.out.println("Hello " + names + "You are Qualify for the followwing loans:/n 1. Asset Finance,/n 2. Personal Loan,/n 3. Business Loan");
            System.out.println("Select the loan you want to apply for(1,2,3): ");
            int loan = scanner.nextInt();
            if (loan == 1) {
                System.out.println("You have been approved for the Asset Finance loan");
            } else if (loan == 2) {
                System.out.println("You have been approved for the Personal loan");
            } else if (loan == 3) {
                System.out.println("You have been approved for the Business loan");
            } else {
                System.out.println("Invalid loan selection");
            }
        }
        if (age > 45 && age < 90 && income > 500000) {
            System.out.println("Hello " + names + "You are Qualify for the followwing loans:/n 1. Jijenge,/n 2. Biashara");
            System.out.println("Select the loan you want to apply for(1,2): ");
            int loan = scanner.nextInt();
            if (loan == 1) {
                System.out.println("You have been approved for the Asset finance loan");
            } else if (loan == 2) {
                System.out.println("You have been approved for the Mega Loan loan");
            } else {
                System.out.println("Invalid loan selection");
            }
        }
        else {
            System.out.println("You do not qualify for any loan");
        }

    }
}