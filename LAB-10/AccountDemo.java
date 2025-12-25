class InSufficientFundException extends Exception {
    InSufficientFundException(String msg) {
        super(msg);
    }
}

class Account {
    int balance = 5000;
    int minBalance = 2000;

    void withdraw(int amount) throws InSufficientFundException {
        if (balance - amount < minBalance) {
            throw new InSufficientFundException("Withdrawal denied! Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdrawal Successful. Remaining Balance = " + balance);
    }
}

class AccountDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        try {
            acc.withdraw(3500);
        } catch (InSufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}
