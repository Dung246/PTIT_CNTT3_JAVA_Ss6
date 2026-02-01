class User {
    private int id;
    private String username;
    private String password;
    private String email;

    User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    int getId() {
        return id;
    }

    String getUsername() {
        return username;
    }

    void setUsername(String username) {
        this.username = username;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email không hợp lệ");
        }
    }

    void setPassword(String password) {
        if (password != null && !password.isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Mật khẩu không được rỗng");
        }
    }

    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("----------------------");
    }
}

public class B6 {
    public static void main(String[] args) {
        User firstUser = new User(1, "Dark4", "123456", "dung@gmail.com");
        User secondUser = new User(2, "Light6", "", "sairoiemail");
        User thirdUser = new User(3, "Shadow8", "abc123", "fafgff@mail.com");

        firstUser.displayInfo();
        secondUser.displayInfo();
        thirdUser.displayInfo();

        firstUser.setEmail("email_sai");
        secondUser.setPassword("");
        thirdUser.setEmail("dung_new@gmail.com");

        firstUser.displayInfo();
    }
}
