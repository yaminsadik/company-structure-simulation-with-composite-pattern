public class SalesDepartment implements Department {
    private int id;
    private String name;

    public SalesDepartment(int id, String username){
        this.id = id;
        this.name = username;
    }
    @Override
    public void printDepartmentName(){
        System.out.println(getClass().getSimpleName());
    }

}
