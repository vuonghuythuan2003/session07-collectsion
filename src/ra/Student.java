package ra;

import java.util.Scanner;

public class Student {
    private int studentId;
    private String name;
    private double averageScore;

    public Student() {
    }

    public Student(int studentId, String name, double averageScore) {
        this.studentId = studentId;
        this.name = name;
        this.averageScore = averageScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public double getAverageScore(Scanner scanner) {
        System.out.println("Nhập vào điểm toán của sinh viên: ");
        double toan = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào điểm văn của sinh viên: ");
        double van = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào điểm sinh của sinh viên: ");
        double sinh = Double.parseDouble(scanner.nextLine());
        System.out.println("Điểm trung bình của sinh viên là: ");
        return (toan + van + sinh) / 3;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên: ");
        this.studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên sinh viên: ");
        this.name = scanner.nextLine();
        this.averageScore = getAverageScore(scanner);
    }

    public void displayData() {
        System.out.println("Mã sinh viên: " + this.studentId);
        System.out.println("Tên sinh viên: " + this.name);
        System.out.println("Điểm trung bình: " + this.averageScore);
    }
}
