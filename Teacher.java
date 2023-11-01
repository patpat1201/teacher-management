package employee;

import java.util.Scanner;

public class Teacher {
    private String teacherCode;
    private String name, phone, mail, department;
    private int age;
    protected int salary, basicsalary;

    public Teacher() {
    }

    public Teacher(String teacherCode, String name, String phone, String mail, int age, int salary, int basicsalary, String department) {
        this.teacherCode = teacherCode;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.age = age;
        this.salary = salary;
        this.basicsalary = basicsalary;
        this.department = department;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public String getName() {
        return name;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter teacher code: ");
        teacherCode = scanner.nextLine();
        System.out.print("Enter teacher name: ");
        name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        phone = scanner.nextLine();
        System.out.print("Enter email: ");
        mail = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter department: ");
        department = scanner.nextLine();
    }

    public int calculateSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Teacher Code: " + this.teacherCode + ", Teacher Name: " + this.name
                + ", Phone: " + this.phone + ", Email: " + this.mail
                + ", Age: " + this.age + ", Basic Salary: " + this.basicsalary;
    }
}
