 class BankAccount {
    private long accountNumber;
    private long balance;



    public long getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.setAccountNumber(1111555566666L);
        obj.setBalance(500066789L);
        System.out.println(obj.getAccountNumber());
        System.out.println(obj.getBalance());
        obj.setAccountNumber(11115557888866L);
        obj.setBalance(56576756789L);
        System.out.println(obj.getAccountNumber());
        System.out.println(obj.getBalance());
    }
    }


