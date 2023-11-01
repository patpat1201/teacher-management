package employee;

import java.util.List;

public interface ITeacherServices {
    public void add(List<Teacher> teacherList);
    public boolean delete(String teacherCode, List<Teacher> teacherList);
    public void edit(String teacherCode, Teacher teacher, List<Teacher> teacherList);
}
