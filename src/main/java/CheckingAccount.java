public class CheckingAccount extends Account {

    public CheckingAccount(double balance, String name) {
        super(balance, name);
    }

    @Override
    public boolean pay(int amount) {
        if (amount > balance) {
            System.out.println("Оплатить нельзя. Недостаточно средств.");
            return false;
        } else {
            System.out.println("Вы совершили покупку на сумму " + amount + " рублей");
            System.out.println("Баланс " + this.getName() + " составляет " + (balance -= amount) + " рублей");
            return true;
        }
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (amount > balance) {
            System.out.println("Перевод осуществить нельзя. Недостаточно средств.");
            return false;
        } else {
            if (!account.addMoney(amount)) {
                System.out.println("Вы не можете осуществить перевод на " + account);
                return false;
            } else {
                System.out.println("Вы осуществили перевод на сумму " + amount + " рублей на " + account);
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
