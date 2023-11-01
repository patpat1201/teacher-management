package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TeacherManagement implements ITeacherServices, ITeacherAction {

    private List<Teacher> teacherList;

    public TeacherManagement() {
        this.teacherList = new ArrayList<>();
    }

    @Override
    public void add(List<Teacher> teacherList) {
        String teacherCode;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: to insert PartTime");
        System.out.println("Enter b: to insert FullTime");
        String type = scanner.nextLine();
        switch (type) {
            case "a": {
                PartTime part = new PartTime();
                System.out.print("Nhập mã giáo viên: ");
                teacherCode = scanner.nextLine();
                part.setTeacherCode(teacherCode);
                part.input();
                part.calculateSalary();
                teacherList.add(part);
                System.out.println(part.toString());
                break;
            }

            case "b": {
                Fulltime full = new Fulltime();
                System.out.print("Nhập mã giáo viên: ");
                teacherCode = scanner.nextLine();
                full.setTeacherCode(teacherCode);
                full.input();
                full.calculateSalary();
                teacherList.add(full);
                System.out.println(full.toString());
                break;
            }
            default:
                System.out.println("Invalid");
                break;
        }
    }

    @Override
    public boolean delete(String teacherCode, List<Teacher> teacherList) {
        Teacher teacherDel = teacherList.stream()
                .filter(teacher -> teacher.getTeacherCode().equals(teacherCode))
                .findFirst()
                .orElse(null);

        if (teacherDel != null) {
            teacherList.remove(teacherDel);
            return true;
        }

        return false;
    }

    @Override
    public void edit(String teacherCode, Teacher teacher, List<Teacher> teacherList) {
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getTeacherCode().equals(teacherCode)) {
                teacherList.set(i, teacher);
                teacherList.get(i).setTeacherCode(teacherCode);
            }
        }
    }

    @Override
    public void search(String name, List<Teacher> teacherList) {
        List<Teacher> searchResults = teacherList.stream()
                .filter(teacher -> teacher.getName().equals(name))
                .collect(Collectors.toList());

        for (Teacher teacher : searchResults) {
            System.out.println(teacher.toString());
        }
    }

    @Override
    public void display(List<Teacher> teacherList) {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.toString());
        }
    }
}
