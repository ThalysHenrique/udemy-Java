package heranca_polimorfismo.application.entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    // posso chamar o "SUPER" nesse construtor padrão, pois se tiver alguma lógica no construtor padrão de "account" posso repetir essa lógica também em "businessAccount"
    // chamo o SUPER para me resguardar, caso seja adicionado alguma coisa no construtor "account"
    public BusinessAccount() {
        super();
    }

    public BusinessAccount(int number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit){
            deposit(amount);
        }
    }

    // super --> chamando superClass
    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }

    public String toString() {
        return super.toString() +
                "\nloan limit: " + getLoanLimit();
    }
}
