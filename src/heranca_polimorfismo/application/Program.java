package heranca_polimorfismo.application;

import heranca_polimorfismo.application.entities.Account;
import heranca_polimorfismo.application.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account x = new Account(0001, "Thalys", 1000.0);
        Account y = new SavingsAccount(0002, "Thalys", 1000.0, 0.1);

        x.withdraw(200.0);
        y.withdraw(200.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }
}
