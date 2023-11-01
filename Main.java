package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Teacher> teacherList = new ArrayList<Teacher>();
        PartTime part = new PartTime();
        Fulltime full = new Fulltime();
        TeacherManagement manager = new TeacherManagement();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("================================");
            System.out.println("Teacher Management Application");
            System.out.println("Enter 1: To insert teacher");
            System.out.println("Enter 2: To search teacher by name: ");
            System.out.println("Enter 3: To show information teacher");
            System.out.println("Enter 4: To delete teacher");
            System.out.println("Enter 5: To edit information teacher");
            System.out.println("Enter 6: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    manager.add(teacherList);
                    break;
                }
                case "2": {
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    manager.search(name, teacherList);
                    break;
                }
                case "3": {
                    manager.display(teacherList);
                    break;
                }
                case "4": {
                    System.out.print("Enter id to delete: ");
                    String id = scanner.nextLine();
                    System.out.println(manager.delete(id, teacherList) ? "Success" : "Fail");
                    break;
                }
                case "5": {
                    System.out.print("Enter id to edit: ");
                    String id = scanner.nextLine();
                    System.out.println("Enter a: to insert PartTime");
                    System.out.println("Enter b: to insert FullTime");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            part.input();
                            part.calculateSalary();
                            manager.edit(id, part, teacherList);
                            break;

                        }
                        case "b": {
                            full.input();
                            full.calculateSalary();
                            manager.edit(id, full, teacherList);
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }

                    break;
                }
                case "6": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
    }
}