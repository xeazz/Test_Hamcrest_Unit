public class SavingsAccount extends Account {
    public SavingsAccount(double balance, String name) {
        super(balance, name);
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("Вы не можете осуществить оплату со " + this.getName());
        return false;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (amount > balance) {
            System.out.println("Перевод осуществить невозможно. Недостаточно средств.");
            return false;
        } else {
            if (!account.addMoney(amount)) {
                System.out.println("Вы не можете осуществить перевод на " + account);
                return false;
            } else {
                System.out.println("Перевод на сумму " + amount + " рублей переведен на " + account);
                System.out.println("Баланс " + this.getName() + " составляет " + (balance -= amount) + " рублей");
                return true;
            }

        }
    }

    @Override
    public boolean addMoney(int amount) {
        System.out.println("Вы пополнили " + this.getName() + " на сумму " + amount + " рублей");
        System.out.println("Баланс " + this.getName() + " составляет " + (balance += amount) + " рублей");
        return true;
    }
}
