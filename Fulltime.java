package employee;

import java.util.Scanner;

public class Fulltime extends Teacher {
    private int teachingShifts; // Thay dayWork thành teachingShifts

    public Fulltime() {
    }

    public Fulltime(int teachingShifts) {
        this.teachingShifts = teachingShifts; // Thay dayWork thành teachingShifts
    }

    public void setTeachingShifts(int teachingShifts) {
        this.teachingShifts = teachingShifts; // Thay setDayWork thành setTeachingShifts
    }

    public int getTeachingShifts() {
        return teachingShifts; // Thay getDayWork thành getTeachingShifts
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input(); // Gọi phương thức input của lớp cha (Teacher)
        System.out.print("Nhập lương cơ bản: ");
        basicsalary = scanner.nextInt();
        System.out.print("Nhập số ca dạy: "); // Thay số ngày làm thành số ca dạy
        teachingShifts = scanner.nextInt(); // Thay dayWork thành teachingShifts
    }

    @Override
    public int calculateSalary() {
        salary = (this.basicsalary / 28) * teachingShifts; // Thay dayWork thành teachingShifts
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n, Số ca dạy: " + this.teachingShifts + ", Tiền lương: " + this.salary;
    }
}
