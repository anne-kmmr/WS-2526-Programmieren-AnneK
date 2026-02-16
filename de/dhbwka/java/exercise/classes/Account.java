package de.dhbwka.java.exercise.classes;

public class Account {

    //Erstellung globaler, privater Variablen
    private int account;
    private String accountHolder;
    private int accountBalance;
    private int payment;
    private int limit;

    //Constructor mit globalen Variablen
    Account(int account, String accountHolder, int accountBalance, int limit) {
        this.account = account;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.payment = payment;
        this.limit = limit;
    }

    //Getter für den Account
    public int getAccount() {
        return account;
    }

    //Getter für den Kontoinhaber
    public String getAccountHolder() {
        return accountHolder;
    }

    //Getter für den Kontostand
    public int getAccountBalance() {
        return accountBalance;
    }

    //Getter für das Limit
    public int getLimit() {
        return limit;
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

    //Überprüfung vor ProcessDeposit/ProcessPayment, ob alles valide ist
    private boolean validityCheck(int payment){
        return (accountBalance - payment) >= -limit;
    }

    //fügt Guthaben zum Kontostand hinzu, je nachdem, ob
    private void processDeposit(int payment) {
        accountBalance += payment;
    }

    //Bucht Guthaben ab
    private void processPayment(int payment) {
        if(validityCheck(payment)){
            accountBalance -= payment;
        } else {
            System.out.println("Deckung nicht ausreichend!");
        }
    }

    //StringToString für die Ausgabe und Darstellung des Kontos (siehe Beispielausgabe in main), je nachdem, ob Abbuchung valide ist oder nicht
    public String toString(){
        if (!validityCheck(payment)){
            return "Deckung nicht ausreichend!\nKonto Nr. " + account + " (" + accountHolder + "), Stand: " + accountBalance + " ct, Limit: " + limit + " ct) ";
        }
        else{
            return "Konto Nr. " + account + " (" + accountHolder + "), Stand: " + accountBalance + " ct, Limit: " + limit + " ct) ";
        }
    }

    //Main als Unittest
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
