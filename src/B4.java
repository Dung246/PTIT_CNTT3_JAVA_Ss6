class Employee {
    String employeeId;
    String fullName;
    double salary;
    Employee() {
        employeeId = "Chưa có";
        fullName = "Chưa có";
        salary = 0;
    }
    Employee(String employeeId, String fullName) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.salary = 0;
    }
    Employee(String employeeId, String fullName, double salary) {
        this.employeeId = employeeId;
        this.fullName = fullName;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Quản lis nhân viên");
        System.out.println("----------------------");
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Lương: " + salary);
        System.out.println("----------------------");
    }
}

public class B4{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("NV01", "Nguyễn Văn A");
        Employee emp3 = new Employee("NV02", "Trần Thị B", 15000000);

        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}
