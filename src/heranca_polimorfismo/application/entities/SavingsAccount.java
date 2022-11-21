package heranca_polimorfismo.application.entities;

// final --> segurança dependendo da regra de negócio --> porta de entrada para incosistências/confusões
// final --> performance --> analisados de forma mais rápida
// final em class --> evita que a classe seja herdada
// final em métodos --> evita que o método seja sobreposto
public final class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    // Override --> sobreposição de método
    @Override
    public void withdraw(double amount){
        balance -= amount;
    }

    public String toString() {
        return super.toString() +
                "\ninterest rate: " + getInterestRate();
    }
}
