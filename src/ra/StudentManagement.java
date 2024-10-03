package ra;

import java.util.Scanner;

public class StudentManagement {
    Student[] student = new Student[100];
    int index = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement management = new StudentManagement();
        management.menu(scanner);
    }

    // Menu chức năng
    public void menu(Scanner scanner) {
        int choice;
        do {
            System.out.println("===== QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Xóa sinh viên theo ID");
            System.out.println("4. Tìm kiếm sinh viên theo ID");
            System.out.println("5. Sắp xếp sinh viên theo điểm trung bình");
            System.out.println("0. Thoát");
            System.out.println("Mời bạn chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    removeStudent(scanner);
                    break;
                case 4:
                    findStudentById(scanner);
                    break;
                case 5:
                    sortByScore();
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Chọn không hợp lệ, vui lòng thử lại.");
            }
        } while (choice != 0);
    }

    // Hiển thị danh sách sinh viên
    public void showAll() {
        for (int i = 0; i < index; i++) {
            student[i].displayData();
        }
    }

    // Thêm sinh viên
    public void addStudent(Scanner scanner) {
        System.out.println("Nhập vào số sinh viên mà bạn muốn thêm: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            student[index] = new Student();
            student[index].inputData(scanner);
            index++;
        }
    }

    // Tìm chỉ số sinh viên theo ID
    public int getId(int studentId) {
        for (int i = 0; i < index; i++) {
            if (student[i].getStudentId() == studentId) {
                return i;
            }
        }
        return -1;
    }

    // Xóa sinh viên theo ID
    public void removeStudent(Scanner scanner) {
        System.out.println("Nhập vào mã ID mà bạn muốn xóa: ");
        int studentIdDelete = Integer.parseInt(scanner.nextLine());
        int indexDelete = getId(studentIdDelete);
        if (indexDelete >= 0) {
            for (int i = indexDelete; i < index - 1; i++) {
                student[i] = student[i + 1];
            }
            student[index - 1] = null;
            index--;
            System.out.println("Xóa thành công.");
        } else {
            System.out.println("Mã sinh viên không tồn tại.");
        }
    }

    // Tìm sinh viên theo ID
    public void findStudentById(Scanner scanner) {
        System.out.println("Nhập mã sinh viên mà bạn muốn tìm kiếm: ");
        int studentId = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (student[i].getStudentId() == studentId) {
                student[i].displayData();
                count++;
            }
        }
        System.out.printf("Tổng có %d sinh viên được tìm thấy.\n", count);
    }

    // Sắp xếp sinh viên theo điểm trung bình
    public void sortByScore() {
        for (int i = 0; i < index - 1; i++) {
            for (int j = i + 1; j < index; j++) {
                if (student[i].getAverageScore() < student[j].getAverageScore()) {
                    Student temp = student[i];
                    student[i] = student[j];
                    student[j] = temp;
                }
            }
        }
        System.out.println("Danh sách sinh viên đã được sắp xếp.");
    }
}
