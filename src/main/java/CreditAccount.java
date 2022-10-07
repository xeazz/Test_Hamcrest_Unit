public class CreditAccount extends Account {
    public static int limit = 50_000;

    public CreditAccount(double balance, String name) {
        super(balance, name);
    }

    @Override
    public boolean pay(int amount) {
        if ((balance - amount < (-1) * limit)) {
            System.out.println("Вы привысили кредитный лимит в " + limit + " рублей и не можете осуществлять данную операцию");
            return false;
        } else {
            System.out.println("Баланс " + this.getName() + " составляет " + (balance -= amount) + " рублей");
            return true;
        }
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if ((balance - amount < (-1) * limit)) {
            System.out.println("Вы привысили кредитный лимит в " + limit + " рублей и не можете осуществлять данную операцию");
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
        if (amount + balance > 0) {
            System.out.println("Вы не можете пополнить счет.");
            System.out.println("Баланс " + this.getName() + " составляет " + balance + " рублей");
            return false;
        } else {
            System.out.println("Вы пополнили " + this.getName() + " на сумму " + amount + " рублей");
            System.out.println("Баланс " + this.getName() + " составляет " + (balance += amount) + " рублей");
            return true;
        }
    }
}
