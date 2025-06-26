/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class StockTradingPlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fixed stock price for all trades
        double stockPrice = 100.0;

        // User details
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter starting balance: ");
        double balance = sc.nextDouble();
        int stocksOwned = 0;

        int choice;

        // Menu loop
        do {
            System.out.println("\n--- Stock Trading Menu ---");
            System.out.println("1. Buy Stock");
            System.out.println("2. Sell Stock");
            System.out.println("3. View Portfolio");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter number of stocks to buy: ");
                int qty = sc.nextInt();
                double totalCost = qty * stockPrice;

                if (balance >= totalCost) {
                    balance -= totalCost;
                    stocksOwned += qty;
                    System.out.println("You bought " + qty + " stocks.");
                } else {
                    System.out.println("Not enough balance.");
                }

            } else if (choice == 2) {
                System.out.print("Enter number of stocks to sell: ");
                int qty = sc.nextInt();

                if (stocksOwned >= qty) {
                    balance += qty * stockPrice;
                    stocksOwned -= qty;
                    System.out.println("You sold " + qty + " stocks.");
                } else {
                    System.out.println("You don't have enough stocks.");
                }

            } else if (choice == 3) {
                System.out.println("\n--- Portfolio ---");
                System.out.println("Name: " + name);
                System.out.println("Balance: $" + balance);
                System.out.println("Stocks Owned: " + stocksOwned);
            } else if (choice == 4) {
                System.out.println("Thanks for using the trading system!");
            } else {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}