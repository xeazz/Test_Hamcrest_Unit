public abstract class Account {
    protected double balance;
    private String name;

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    abstract boolean pay(int amount);

    abstract public boolean transfer(Account account, int amount);

    abstract public boolean addMoney(int amount);

    public String toString() {
        return getName();
    }

    public String getName() {
        return name;
    }
}

