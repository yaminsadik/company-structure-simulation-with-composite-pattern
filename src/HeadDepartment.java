import java.util.ArrayList;
import java.util.List;
public class HeadDepartment implements Department{
    private int id;
    private String name;
    private List<Department> departments;

    public HeadDepartment (int id, String username){
        this.id = id;
        this.name = username;
        this.departments = new ArrayList<>();
    }
    public void addDepartment(Department department)
    {
        departments.add(department);
    }
    public void removeDepartment(Department department)
    {
        departments.remove(department);
    }
    @Override
    public void printDepartmentName(){
        for (Department department : departments){
            department.printDepartmentName();
        }
    }
}
