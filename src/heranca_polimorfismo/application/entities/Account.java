package heranca_polimorfismo.application.entities;

public class Account {
    private int number;
    private String holder;
    protected Double balance;

    public Account(){

    }

    public Account(int number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    // quando sacar vai descontar a taxa de 5 reais
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public String toString() {
        return "\nnumber: " + getNumber() +
                "\nholder: " + getHolder() +
                "\nbalance: " + getBalance();
    }
}
