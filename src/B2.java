class Account {
    String username;
    String password;
    String email;
    Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    void changePassword(String newPassword) {
        password = newPassword;
        System.out.println("Đổi mật khẩu thành công");
    }

    void displayInfo( ) {
        System.out.println("Tên đăng nhập: " + username);
        System.out.println("Email: " + email);
        System.out.println("Mật khẩu: ******");
        System.out.println("----------------------");
    }
}
public class B2 {
    public static void main(String[] args) {
        Account firstAcc = new Account("dung123", "123456", "dung@gmail.com");

        firstAcc.displayInfo();
        firstAcc.changePassword("abc123");
        firstAcc.displayInfo();
    }
}
