package de.dhbwka.java.exercise.classes;

public class Account {

    //Erstellung gloaber, privater Variablen
    private int account;
    private String accountHolder;
    private int accountBalance;
    private int limit;

    Account(int account, String accountHolder, int accountBalance, int limit) {
        this.account = account;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.limit = limit;
    }

    //Getter für Account
    public int getAccount() {

    }

    //Getter für den Kontoinhaber
    public String getAccountHolder() {

    }

    //Getter für den Kontostand
    public int getAccountBalance() {

    }

    //Getter für das Limit
    public int getLimit() {

    }

    //Setter für den Account
    public void setAccount(int account) {
        this.account = account;
    }

    //Setter für den Kontostand
    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    //Setter für den Kontoinhaber
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    //Setter für das Limit
    public void setLimit(int limit) {
        this.limit = limit;
    }

    //StringToString für die Ausgabe und Darstellung des Kontos
    public String toString(){
        //String-Ausgabe für Output/Main
    }

    public void processDeposit(){
        //Fügt Guthaben hinzu
    }

    public void processPayment(){
        //Zieht Guthaben ab
    }

    public static void main(String[] args) {
        Account account = new Account(4711, "Donald Duck", 500, 1000);
        System.out.println(account);
        account.processDeposit(200);
        System.out.println(account);
        account.processPayment(400);
        System.out.println(account);
        account.processPayment(2000);
        System.out.println(account);
    }


}
