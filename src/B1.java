class Student {
    String studentId;
    String fullName;
    int birthYear;
    double gpa;

    Student(String studentId, String fullName, int birthYear, double gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gpa = gpa;
    }

    void displayInfo() {
        System.out.println("----------------------");
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Năm sinh: " + birthYear);
        System.out.println("Điểm trung bình: " + gpa);
        System.out.println("----------------------");
    }
}

public class B1 {
    public static void main(String[] args) {
        Student student1 = new Student("PTIT001", "Nguyễn Trần Bảo Khánh", 2006, 8.5);
        Student student2 = new Student("PTIT002", "Bàng Đệ Tam", 2005, 8.8);

        student1.displayInfo();
        student2.displayInfo();
    }
}
