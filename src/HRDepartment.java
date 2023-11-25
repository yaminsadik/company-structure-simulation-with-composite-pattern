public class HRDepartment implements Department {
    private int id;
    private String name;

    public HRDepartment(int id, String username){
        this.id = id;
        this.name = username;
    }
    public void printDepartmentName(){
        System.out.println(getClass().getSimpleName());
    }

}
