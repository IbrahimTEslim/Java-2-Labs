package Java2Labs.Lab_02As2;

import java.util.ArrayList;
import java.util.Date;

public class Lab_02Ch11Q8 {
    public static void main(String[] args) {
        Account acc=new Account("George",1122,1000);
        acc.setAnnualInterestRate(0.15f);
        acc.deposit(30); acc.deposit(40); acc.deposit(50);
        acc.withDraw(5); acc.withDraw(4); acc.withDraw(2);
        acc.summary();
    }
    static class Account {
        private String name;
        private int id = 0;
        private double balance = 0, annualInterestRate;
        private Date dateCreated = new Date();
        private ArrayList<Transaction> arr = new ArrayList<>();
        public void setId(int id) { this.id = id;}
        public void setBalance(double balance) { this.balance = balance; }
        public void setAnnualInterestRate(double annualInterestRate) {this.annualInterestRate = annualInterestRate; }
        public int getId() { return id; }
        public Account(int id, double balance) {this.id = id;  this.balance = balance; }
        public Account(String name,int id, double balance) {this.name=name; this.id = id;  this.balance = balance; }
        public Account() {  dateCreated.setTime(System.currentTimeMillis()); }
        public double getAnnualInterestRate() { return annualInterestRate;}
        public Date getDateCreated() { return dateCreated; }
        public double getBalance() {return balance;  }
        public void withDraw(int amount) {
            this.balance -= amount;
            Date tempDate=new Date();
            arr.add(new Transaction(tempDate,'W',this.balance,amount,"withdraw from the account: "+amount));
        }
        public void deposit(int amount) {
            this.balance += amount;
            Date tempDate=new Date();
            arr.add(new Transaction(tempDate,'D',this.balance,amount,"deposit to the account: "+amount));
        }
        public void summary(){
            System.out.println("Summary for "+this.name);
            System.out.println("Interest Rate: "+this.annualInterestRate);
            System.out.println("Balance: "+this.balance);
            System.out.println("-------------Account Transactions-------------");
            for (int i = 0; i < arr.size(); i++) {
                System.out.println("Transaction Date: "+arr.get(i).getDate());
                System.out.println("Transaction Type: "+arr.get(i).getType());
                System.out.println("Transaction Amount: "+arr.get(i).getAmount());
                System.out.println("Account Balance: "+arr.get(i).getBalance());
                System.out.println("Transaction Description: "+arr.get(i).getDescription());
                System.out.println("--------------------------");
            }
        }
    }
    static class Transaction {
        private java.util.Date date;
        private char type;
        private double balance,amount;
        private String description;

        public Date getDate() { return date;}
        public char getType() {return type;}
        public double getBalance() { return balance;  }
        public void setDate(Date date) {this.date = date;}
        public void setType(char type) {this.type = type; }
        public double getAmount() {return amount; }
        public void setBalance(double balance) {this.balance = balance;}
        public void setAmount(double amount) {this.amount = amount;}
        public void setDescription(String description) {this.description = description;}
        public String getDescription() {return description; }

        public Transaction(java.util.Date date, char type,double balance,double amount,String description) {
            this.date = date;
            this.type = type;
            this.amount = amount;
            this.balance=balance;
            this.description = description;
        }
    }
}
