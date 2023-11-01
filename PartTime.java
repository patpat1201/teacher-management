package employee;

import java.util.Scanner;

public class PartTime extends Teacher {
    private int teachingShifts; // Thay timeWork thành teachingShifts

    public PartTime() {
    }

    public PartTime(int teachingShifts) {
        this.teachingShifts = teachingShifts; // Thay timeWork thành teachingShifts
    }

    public void setTeachingShifts(int teachingShifts) {
        this.teachingShifts = teachingShifts; // Thay setTimeWork thành setTeachingShifts
    }

    public int getTeachingShifts() {
        return teachingShifts; // Thay getTimeWork thành getTeachingShifts
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input(); // Gọi phương thức input của lớp cha (Teacher)
        System.out.print("Nhập lương cơ bản theo giờ: ");
        basicsalary = scanner.nextInt();
        System.out.print("Nhập số ca dạy: "); // Thay số giờ làm thành số ca dạy
        teachingShifts = scanner.nextInt(); // Thay timeWork thành teachingShifts
    }

    @Override
    public int calculateSalary() {
        salary = this.basicsalary * this.teachingShifts; // Thay timeWork thành teachingShifts
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n, Số ca dạy: " + this.teachingShifts + ", Tiền lương: " + this.salary;
    }
}
