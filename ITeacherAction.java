package employee;

import java.util.List;

public interface ITeacherAction {
    public void search(String name, List<Teacher> teacherList);
    public void display(List<Teacher> teacherList);
}
