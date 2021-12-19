package Java2Labs.Lab_01As1;

import java.util.Date;
import java.util.Scanner;

public class Lab_02Ch10Q7 {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account();
            accounts[i].setBalance(100);
        }
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an id: ");
            int id = input.nextInt();
            if (id < 0 || id > 9) {
                System.out.println("Enter a correct id");
                continue;
            }
            System.out.println("1: check balance\n" + "2: withdraw\n" + "3: deposit\n" + "4: exit");
            System.out.print("Enter a choice: ");
            int choice = input.nextInt();
            if (choice == 1) { System.out.println("The balance is: " + accounts[id].balance); }
            else if (choice == 2) {
                System.out.print("Enter an amount to withdraw:");
                int amount = input.nextInt();
                accounts[id].withDraw(amount);
            } else if (choice == 3) {
                System.out.print("Enter an amount to deposit:");
                int amount = input.nextInt();
                accounts[id].deposit(amount);
            } else continue;
        }
    }

    static class Account {
        private int id = 0;
        private double balance = 0, annualInterestRate;
        private Date dateCreated = new Date();
        public void setId(int id) { this.id = id;}
        public void setBalance(double balance) { this.balance = balance; }
        public void setAnnualInterestRate(double annualInterestRate) {this.annualInterestRate = annualInterestRate; }
        public int getId() { return id; }
        public Account(int id, double balance) {this.id = id;  this.balance = balance; }
        public Account() {  dateCreated.setTime(System.currentTimeMillis()); }
        public double getAnnualInterestRate() { return annualInterestRate;}
        public Date getDateCreated() { return dateCreated; }
        public double getBalance() {return balance;  }
        public void withDraw(int amount) {this.balance -= amount;}
        public void deposit(int amount) {this.balance += amount;}
    }
}