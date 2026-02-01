class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    // Constructor không tham số
    BankAccount() {
        this.accountNumber = "Chưa có";
        this.ownerName = "Chưa có";
        this.balance = 0;
    }

    // Constructor có tham số
    BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        setBalance(balance);
    }

    String getAccountNumber() {
        return accountNumber;
    }

    void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    String getOwnerName() {
        return ownerName;
    }

    void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Số dư không hợp lệ (không được âm)");
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp tiền thành công: +" + amount);
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Rút tiền thành công: -" + amount);
        } else {
            System.out.println("Số tiền rút không hợp lệ hoặc không đủ số dư");
        }
    }

    void displayInfo() {
        System.out.println("Số tài khoản: " + accountNumber);
        System.out.println("Chủ tài khoản: " + ownerName);
        System.out.println("Số dư: " + balance);
        System.out.println("----------------------");
    }
}

public class BTTH {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC001", "Nguyễn Văn A", 5000000);
        BankAccount acc2 = new BankAccount("ACC002", "Trần Thị B", 3000000);

        acc1.displayInfo();
        acc2.displayInfo();

        acc1.deposit(2000000);
        acc1.withdraw(1000000);

        acc2.deposit(500000);
        acc2.withdraw(4000000); // rút quá số dư

        acc1.displayInfo();
        acc2.displayInfo();
    }
}
