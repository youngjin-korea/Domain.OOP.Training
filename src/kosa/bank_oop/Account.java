package kosa.bank_oop;

public class Account {
    private String id;
    private long balance;

    public Account() {
    }

    public Account(String id, long balance) {
        this.balance = balance;
        this.id = id;
    }

    public void deposit(long amount) {
        balance += amount;
    }

    public boolean withdraw(long amount) {
        if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
            return false;
        }
        balance -= amount;
        return true;
    }

    public String getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }
}
